package com.xaccp.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class A {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(4567);
			System.out.println("�ȴ���ĵ���......������¡");
			Socket client= ss.accept();
			System.out.println("����:"+client.getInetAddress().getHostAddress() );
	    	     OutputStream outs= client.getOutputStream();
			 BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(outs));
			 
			 bw.write("���!���Ƿ����� ���ip��"+client.getInetAddress().getHostAddress());
			  
			 bw.flush();
			 bw.close();
			 client.close();
			 ss.close();
				
			} catch (IOException e) {
				System.out.println("����!");
			}
		}
}

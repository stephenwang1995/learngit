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
			System.out.println("等待你的到来......西安兆隆");
			Socket client= ss.accept();
			System.out.println("来了:"+client.getInetAddress().getHostAddress() );
	    	     OutputStream outs= client.getOutputStream();
			 BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(outs));
			 
			 bw.write("你好!我是服务器 你的ip是"+client.getInetAddress().getHostAddress());
			  
			 bw.flush();
			 bw.close();
			 client.close();
			 ss.close();
				
			} catch (IOException e) {
				System.out.println("错误!");
			}
		}
}

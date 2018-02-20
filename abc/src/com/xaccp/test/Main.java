package com.xaccp.test;

public class Main {  
    public static void main(String[] args) {  
        Main main = new Main();  
        main.startThread();  
    }  
  
    /** 
     * �߳��� 
     */  
    private final Object object = new Object();  
  
    /** 
     * �����߳� 
     */  
    public void startThread() {  
        Thread t = new Thread(new Runnable() {  
            @Override  
            public void run() {  
                System.out.println("��ʼִ���̡߳�����");  
                System.out.println("����ȴ�״̬������");  
                synchronized (object) {  
                    try {  
                        object.wait();  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
                System.out.println("�߳̽���������");  
            }  
        });  
        t.start();  
    }  
}  

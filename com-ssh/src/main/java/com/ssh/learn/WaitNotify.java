/*
 * @Title : WaitNotify.java
 * 
 * @version V2.0.0
 * @date：2018年7月25日
 * @Copyright © 2018 江苏华叶跨域教育科技发展股份有限公司 Corporation. All rights reserved. 
 */
package com.ssh.learn;

/** 
 * @ClassName: WaitNotify 
 * @Description: TODO
 * @author zhusiyang
 * @since v2.0.0
 * @date 2018年7月25日 
 *  
 */
public class WaitNotify {
public static void main(String[] args) {
	Print print = new Print(2);
	new Thread(print, "A").start();
	new Thread(print, "B").start();
	new Thread(print, "C").start();
}
private final static Object lock = new Object();
static class Print implements Runnable{
	private int max_print;
	private int count = 0;
	private String str = "A";
	public Print(int max_print) {
		this.max_print = max_print;
	}
	/**
	 * <p>Title: run</p> 
	 * <p>Description: </p>  
	 * @see java.lang.Runnable#run() 
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			String name = Thread.currentThread().getName();
			System.out.println("name:"+name+",str:"+str);
			while(count < max_print){
				if(str.equals(name)){
					System.out.println("打印：" + name);
					if(str.equals("A")){
						str = "B";
					}else if(str.equals("B")){
						str = "C";
					}else {
						count++;
						str = "A";
					}
					lock.notifyAll();
				}else{
					try{
						lock.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}
	
}
}

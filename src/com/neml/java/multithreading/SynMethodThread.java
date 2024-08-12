package com.neml.java.multithreading;

public class SynMethodThread {

	public static void main(String[] args) {
		
		Multiple m1 = new Multiple();
		
		getMultipleofFive ft = new getMultipleofFive(m1);
		ft.start();
		
		getMultipleofTen tt = new getMultipleofTen(m1);
		tt.start();

	}

}

class Multiple {
	
	public synchronized void getMultipleOf(int num) {
		
//		synchronized(this) {
		int result=0;
		 for(int i=1;i<=5;i++){  
			 result = num*i;
		      System.out.println(Thread.currentThread().getName()+ " - "+ result);    
		      try{    
		       Thread.sleep(400);    
		      }catch(Exception e){System.out.println(e);}    
		     }   
//		}
		
	}
	
}

class getMultipleofFive extends Thread{
	
	Multiple m;
	getMultipleofFive(Multiple m){
		this.m = m;
	}
	public void run() {	
	//System.out.println("Get the multiple of 5");
		m.getMultipleOf(5);
		//System.out.println("Get the multiple of 5");
	}
	
}
class getMultipleofTen extends Thread{
	
	Multiple m;
	getMultipleofTen(Multiple m){
		this.m = m;
	}
	public void run() {
//	System.out.println("Get the multiple of 10");
		m.getMultipleOf(10);
	//	System.out.println("Get the multiple of 10");
		
	}
	
}
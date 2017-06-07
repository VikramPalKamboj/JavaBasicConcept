package multithreading;

public class SingleTaskMultipleThread implements Runnable{  
	public void run(){  
		System.out.println("task one");  
		}  
		  
		public static void main(String args[]){  
		Thread t1 =new Thread(new SingleTaskMultipleThread());
		Thread t2 =new Thread(new SingleTaskMultipleThread());  
		  
		t1.start();  
		t2.start();  
		  
		 }  
		}  

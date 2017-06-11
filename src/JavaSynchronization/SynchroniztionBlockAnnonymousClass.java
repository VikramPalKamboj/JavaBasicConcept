package JavaSynchronization;


class Tabless{
	
	void printTable(int i) {
		
		synchronized(this){
			for (int j = 0; j < 5; j++) 
			{
				System.out.println(i*j);
				try{  
				      Thread.sleep(400);  
				     }
				 catch(Exception e){
					 System.out.println(e);
					 } 
			}
		}
		 
	}
	
}

public class SynchroniztionBlockAnnonymousClass {
	
	
	public static void main(String[] args){
	final Tabless obj=new Tabless();
	
	
	Thread t1=new Thread(){
	public void run(){
		obj.printTable(5);
	}
	};
	Thread t2=new Thread(){
	public void run(){
		obj.printTable(100);
	}
	};
	t1.start();
	t2.start();
	
	}
	
}

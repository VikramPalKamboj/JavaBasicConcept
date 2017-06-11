package JavaSynchronization;


class Tablesss{
	
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

public class StaticSyncronization {
	
	
	public static void main(String[] args){
	final Tablesss obj=new Tablesss();
	
	
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
	Thread t3=new Thread(){
		public void run(){
			obj.printTable(100);
		}
		};	
	Thread t4=new Thread(){
		public void run(){
			obj.printTable(100);
		}
		};
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	}
	
}

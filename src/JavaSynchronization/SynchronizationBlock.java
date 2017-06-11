package JavaSynchronization;


class Tables{
	void printable(int i){
		
	}

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

class Thread6 extends Thread{
	
	Tables i;
	public Thread6(Tables i) {
		this.i = i;
	}
	
	public void run(){  
		i.printTable(5);  
		} 
	
}
class Thread4 extends Thread{
	Tables i;

	public Thread4(Tables i) {
		this.i = i;
	}
	
	public void run(){  
		i.printTable(100);  
		}  
}

public class SynchronizationBlock {
	
	
	public static void main(String[] args){
	Tables obj=new Tables();
	Thread4 t1=new Thread4(obj);
	Thread6 t2=new Thread6(obj);
	t1.start();
	t2.start();
	
	}
	
}

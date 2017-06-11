package JavaSynchronization;


class Table{
	void printable(int i){
		
	}

	synchronized void printTable(int i) {
		
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

class Thread1 extends Thread{
	
	Table i;
	public Thread1(Table i) {
		this.i = i;
	}
	
	public void run(){  
		i.printTable(5);  
		} 
	
}
class Thread2 extends Thread{
	Table i;

	public Thread2(Table i) {
		this.i = i;
	}
	
	public void run(){  
		i.printTable(100);  
		}  
}

public class TestingSynchronization2 {
	
	
	public static void main(String[] args){
	Table obj=new Table();
	Thread1 t1=new Thread1(obj);
	Thread2 t2=new Thread2(obj);
	t1.start();
	t2.start();
	
	}
	
}

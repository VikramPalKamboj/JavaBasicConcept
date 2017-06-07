package multithreading;

public class DaemonThread extends Thread {
	
	public void run(){
		try {
			if(Thread.currentThread().isDaemon()){
				System.out.println("DaemonThread");
			}
			System.out.println("normal thread");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		DaemonThread dt=new DaemonThread();
		DaemonThread dt1=new DaemonThread();
		DaemonThread dt2=new DaemonThread();
		
		dt.setDaemon(true);
		dt2.setPriority(MAX_PRIORITY);
		dt1.start();
		dt2.start();
	}

}

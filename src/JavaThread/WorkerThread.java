package JavaThread;
 
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        try { 
        	Thread.sleep(2000);
        	} 
        catch (InterruptedException e) { 
        	e.printStackTrace();
        	}  
        System.out.println(Thread.currentThread().getName()+" (End)");
    }   
}  
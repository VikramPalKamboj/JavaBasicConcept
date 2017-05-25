package RunTimePolymorphism;

class Comman{

	public void runtime() {
		System.out.println("true3");
	}
	
}
class RunTime extends Comman{
	

    public void runtime(){
		System.out.println("true1");
		
	}
}
class RunTime1 extends RunTime{
	
	
      public void runtime(){
		System.out.println("true2");
		
	}
}
public class RunTimePolymorphism extends RunTime{

    public void runtime(){
		System.out.println(true);
		
	}
	
	public static void main(String[] args){
		Comman rtp=new RunTime1();
		Comman rtp1=new RunTime();
		rtp.runtime();
		rtp1.runtime();
	}

}

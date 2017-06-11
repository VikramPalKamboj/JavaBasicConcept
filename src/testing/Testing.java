package testing;
import java.io.IOException;

public class Testing {
	
	public void tester() 
	{
		try {
			
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Testing ts=new Testing();
		ts.tester();
	}


}

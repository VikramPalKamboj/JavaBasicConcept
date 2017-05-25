package InstanceInitializerblock;


class First{
	First(){
		System.out.println("testphase2");
	}
}
public class InstanceinitializerblockBlock extends First {
	
	public InstanceinitializerblockBlock() {
		super();
		System.out.println("Instance initializer block 2");

	}
	public InstanceinitializerblockBlock(int a) {
		super();
		System.out.println("Instance initializer block 2"+a);

	}
	
	{System.out.println("Instance initializer block");}
	public static void main(String[] args){
		 InstanceinitializerblockBlock inb=new InstanceinitializerblockBlock();
		 InstanceinitializerblockBlock inb2=new InstanceinitializerblockBlock(10);

	}

}

package accessModifiers;


 class Testing{
	protected void testing(){
		System.out.println("Testing phase");
	}
}
class AccessModifiers extends Testing {

	// Without public access modifier this program will be give compile time error.
	public void testing(){
		System.out.println("Testing phase II ");
	}
	

	public static void main(String[] args) {

		AccessModifiers ts=new AccessModifiers();
		ts.testing();
	}

}

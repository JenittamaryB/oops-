package oopsprogram;

interface Bank{
	void sbi();
	void indianBank();
	void overseaBank();
	int a=9;
}
/*public void main() {//we not create normal method because all methods are abstract by default
	System.out.println("basant..");
}	*/
public class Interface implements Bank{
	
	
	public static void main(String[] args) {
		Interface i=new Interface();
		i.sbi();
		i.indianBank();
		i.overseaBank();
		System.out.println(i.a);//varaible cannot override because it is static and final
	}
	@Override
	public void sbi() {
		System.out.println("loan creation..");	
	}
	@Override
	public void indianBank() {
		System.out.println("account creation..");	
	}

	@Override
	public void overseaBank() 
	{
		System.out.println("account..");
		
	}
}

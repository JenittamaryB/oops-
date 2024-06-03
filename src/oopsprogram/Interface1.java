package oopsprogram;

interface UnionGovt{
	public void caa();
}
 interface StateGovt extends UnionGovt{
	public void tax();
}
 class Family{
	 public void it()
		{
			System.out.println("welcome;");
		}
		public void electrician()
		{
			System.out.println("hello");
		}
 }
public class Interface1 extends Family implements StateGovt,Bank//multiple inheritence is called as daimond ring problem because more than one parent class there
{
	
	public static void main(String[] args) {
		Interface1 i=new Interface1();
		i.it();
		i.tax();
		i.caa();
		i.sbi();
		i.indianBank();
		i.overseaBank();
		System.out.println(i.a);//bank interface variable

	}
	public void tax() {
		System.out.println("tax paid");
	}
	public void caa() {
		System.out.println("Citizen");
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
	public void overseaBank() {
		System.out.println("account..");
		
	}
}

package oopsprogram;
class Animal{
	public void type() {
	System.out.println("Animal types..");
}
}
class Lion extends Animal{
	public void type1() {

	System.out.println("lion king..");
}
}
class Tiger extends Lion{
	public void type2() {
	System.out.println("bengal tiger..");
}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Tiger l=new Tiger();
		l.type2();
		l.type();
		l.type1();
		
		
	}
	}


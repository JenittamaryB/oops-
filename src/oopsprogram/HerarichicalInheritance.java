package oopsprogram;

class Animal1{
	public void type() {
	System.out.println("Animal types..");
}
}
class Lion1 extends Animal1{
	public void type1() {

	System.out.println("lion king..");
}
}
class Tiger1 extends Animal1{
	public void type2() {
	System.out.println("bengal tiger..");
}
}
public class HerarichicalInheritance {
	public static void main(String[] args) {
		Tiger1 t=new Tiger1();
		Lion1 l=new Lion1();
		l.type();
		l.type1();
		t.type();
		t.type2();
	}
}

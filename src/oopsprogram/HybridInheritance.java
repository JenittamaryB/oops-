package oopsprogram;

class R15Bike1{
	public void colour() {
		System.out.println("blue");
	}
}
class Pulsur extends R15Bike{
	public void colour1() {
	System.out.println("black..");
}
}
class Duke extends Pulsur{
	public void colour2() {
		System.out.println("orange..");
	}
}
class Fz extends Pulsur{
	public void colour3() {
		System.out.println("pink..");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		Fz f=new Fz();
		f.colour();
		f.colour1();
		f.colour3();
		Duke d=new Duke();
		d.colour();
		d.colour1();
		d.colour2();

	}

}

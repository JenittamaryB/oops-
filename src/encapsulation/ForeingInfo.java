package encapsulation;
import oopsprogram.SingleInheritance;//we import  single inheritance class
public class ForeingInfo {
	public static void main(String[] args) {
		SingleInheritance si=new SingleInheritance();//here we create object for another package class 
     si.colour();//here we use the another package class method because it public 
	}

}

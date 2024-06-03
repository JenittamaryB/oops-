package oopsprogram;
abstract class Employee{
	abstract void test();//abstract method without body or definition
	abstract void test1();//Concrete method is also known as non abstract method
	abstract void test2();
	int value=10;

public void main() { //in abstraction we use normal method also
	System.out.println("basant..");
}	
}

public class Abstraction extends Employee
{
	public static void main(String[] args) 
	{
		Abstraction a=new Abstraction();
		a.test();
		a.test1();
		a.test2();
		System.out.println(a.value=30);//variable not be static and final we can reassign value
		
	}
	@Override
	void test() {//override abstract method 
		System.out.println("software test");	
	}
	@Override
	void test1() 
	{
		System.out.println("data analyst test");	
	}
	@Override
	void test2() 
	{
		System.out.println("data science test");	
		
	}

}

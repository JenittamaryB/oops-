package oopsprogram;
class Super2
{
	String name;
	int age;
	Super2(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("name is:"+name+" age:"+age);
	}
public  void eat()
{
System.out.println("eating..");
}
}
public class ThisSuper extends Super2{
		 ThisSuper(String name,int age) {
		super(name,age);//here it is super()method we call the name and age in child class
		
		
	}
    public void eat() {
    	System.out.println("lunch..");
    }
		public void work()
		 {
		 	System.out.println("working.."+ "");
		 	super.eat();//this super keyword it call the method eat in child class
		 }
		
	public static void main(String[] args) {
		ThisSuper ts=new ThisSuper("muthu",23);
        ts.work();
	}

}

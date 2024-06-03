package oopsprogram;

public class Constructor {//constructor means obj specific value
	int a;
	float b;
	String name;
	Constructor()
	{
		System.out.println("default Constructor...");
	}
	Constructor(int a,float b)
	{
		this.a=a;
		this.b=b;
	}
	Constructor(int a,float b,String c)
	{
		name=c;
		System.out.println("value of a:"+a+ " value of b:"+b+ " name is:"+c);
	}
	
	public void display()
	{
		System.out.println("value of a:"+a+ " value of b:"+b);
	}
		
	public static void main(String[] args) {
		Constructor d=new Constructor();
		Constructor h=new Constructor(10,2.0f);
		Constructor e=new Constructor(11,2.1f,"muthu");
		h.display();
	}

}

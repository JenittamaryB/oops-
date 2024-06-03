package oopsprogram;

public class MethodOverload 
{
    static int a=2;
	static float b=3.1f;
	static int c=4;
	
	public void work(int value) 
	{
	 System.out.println(value);
	}
	public void work(float value1 ,int value ) 
	{
		 System.out.println(value1 + value);
	}
	public void work(int value,int value3) 
	{
		 System.out.println(value + value3);
		}
	public static void main(String[] args) {
		MethodOverload ob=new MethodOverload();
		ob.work(a);
		ob.work(b,a);
		ob.work(a,c);;
		
		
	}

}

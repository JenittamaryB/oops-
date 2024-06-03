package oopsprogram;
   
class Override1{//this one class 
    static int a=5;
	static float b=3.1f;
	static float c=4.4f;
	public void work(int a) 
	{
	 System.out.println(a);
	}
	public void work(float b ,float c) 
	{
		 System.out.println(b + a);
	}
	public void work(int a,float c) 
	{
		 System.out.println(a + c);
		}
}
public class MethodOverriding extends Override1{//this is another class for override should be extends

	public static void main(String[] args) {
		MethodOverriding ob=new MethodOverriding();
		ob.work(a);
		ob.work(b,a);
		ob.work(a,c);
		
		

	}

}



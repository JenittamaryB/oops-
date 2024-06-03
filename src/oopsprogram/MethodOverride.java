package oopsprogram;

class Method
{
	public void work() 
	{
		System.out.println("the work is on");
	}
}
public class MethodOverride extends Method 
  {
	public void work()
      {
	    System.out.println("The work is off");
      }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     MethodOverride mo=new MethodOverride();
     mo.work();
	}

}

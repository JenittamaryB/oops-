package basicprogram;

public class Fibanocci 
{
public void fibo()
{
	int first=-1;
	int second=1;
	int third=0;
	while(third<=10)
	{
		third=first+second;
		first=second;
		second=third;
		System.out.print(third+" ");
	}
}
	public static void main(String[] args)
	{		
Fibanocci d=new Fibanocci();
d.fibo();
}
}

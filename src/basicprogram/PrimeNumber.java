package basicprogram;

public class PrimeNumber {
	int num=71;
	int div=2;
	boolean prime=true;
	public void prime()
	{
		 while(num>div) {
	     if(num%div==0)
			{
				System.out.println("not a prime");
				prime=false;
				break;
			}
			div++;
		}
		if(prime==true)
		{
			System.out.println("prime number:"+num);
		}
	}
	public static void main(String[] args) {
		PrimeNumber p=new PrimeNumber();
		p.prime();
	}
}


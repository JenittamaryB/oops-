package basicprogram;

public class SpyNumber 
{
	public static void main(String[] args)
	{
		SpyNumber s=new SpyNumber();
		s.checkSpyNumber();
	}
public void checkSpyNumber()
{
	int number = 123; // Example number  
    int sumOfDigits = 0;
    int productOfDigits = 1;
    int remainder ;
    int originalNumber = number;
    while (originalNumber > 0) 
    {
        remainder = originalNumber % 10;
        sumOfDigits += remainder;
        productOfDigits *= remainder;
        originalNumber /= 10;
    }
    if (sumOfDigits == productOfDigits) {
        System.out.println(number + "  Spy number.");
    } else {
        System.out.println(number + "  not a Spy number.");
    }
}
}


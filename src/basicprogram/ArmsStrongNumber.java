package basicprogram;

public class ArmsStrongNumber
{

	public static void main(String[] args) {
		ArmsStrongNumber a=new ArmsStrongNumber();
		a.checkNumber();
	}
public void checkNumber()
{
	int number = 154;  
    int originalNumber;
    int remainder;
    int result = 0;
    originalNumber = number;

    while (originalNumber > 0) //153!=0
    {
        remainder = originalNumber % 10;//153%10 it give the remainder
        result += Math.pow(remainder, 3);//this for cube the remainder
        originalNumber = originalNumber/10;//153/10 update the value
    }
    if (result == number)//153==153
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");
}
}


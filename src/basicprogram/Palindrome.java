package basicprogram;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome n=new Palindrome();
		n.checkPalindrome();
        //n.checkPalindrome1();
	}

public void checkPalindrome()
{
	int number=454;  // Example number
    int originalNumber;
    int remainder, result = 0;
    originalNumber = number;   
	  while(originalNumber>0)
	  {    
		remainder=originalNumber%10;  //to getting remainder  
	    result=(result*10)+remainder;    
	   originalNumber=originalNumber/10;    
	  }    
	  if(result==number)    
	   System.out.println(number+" palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  



    public void checkPalindrome1() 
   {
    String reverse =""; // Objects of String class  
    Scanner n = new Scanner(System.in); //input is rar  
    System.out.println("Enter a string/number to check if it is a palindrome :");  
    String original = n.nextLine(); 
    
    for ( int i = original.length()- 1; i >= 0; i-- )  
    reverse = reverse + original.charAt(i); // r a r
   if (original.equals(reverse)) 
   { 
    System.out.println(original+":is a palindrome.");  
   }
   else 
   {
   System.out.println("not a palindrome.");
   }
  }  
}

package basicprogram;

public class PatternProgram {

		public static void main(String[] args) {
			PatternProgram pp = new PatternProgram();
			//pp.printNo();
			//pp.printNo1();
			//pp.printNo2();
			//pp.printNo3();
			//pp.printNo4();
			//pp.printNo5();
			//pp.printNo6();
			//pp.printNo7();
			//pp.printNo();
			//pp.printOddEven1();
			//pp.printDiamond();
			//pp.printDiamond1();
			pp.numberPattern();
			
			}

		private void printNo7() {
			/*output
			* * * * 1 
			* * * 1 2 
			* * 1 2 3 
			* 1 2 3 4 
			1 2 3 4 5*/
			
			for(int row=1; row<=5; row++) //1<=5
				{
				for(int star=4; star>=row; star--)//4>=1 3>=1
				{
					System.out.print("*"+" ");//* * * *
				}
				
				for(int col=1; col<=row; col++)//1<=1
				{                              					                           //5<=5
					System.out.print(col+" ");//1 					                            //1 2
				}
				System.out.println();
}		
			
		}
		
		
	

	private void printNo6() {
		/*output
		 5 10 15 20 25 
		  4 8 12 16 
		  3 6 9 
	      2 4 
		  1 */ 
		
		for(int row=5; row>=1; row--)//5>=1 
			                         //4>=1
		{
			for(int col=1; col<=row; col++) //1<=5 2<=5 ...6<=5
				                            // 1<=4  2<=4
			{
				System.out.print(row*col + " ");//5*1=5 5*2=10	
			}
			System.out.println();
		}	
	}
	private void printNo5() {
		/*output
		3 3 3
		2 2
		1 */
		
		for(int row=3; row>=1; row--) 
		{
			for(int col=1; col<=row; col++) //1<=3
			{
				System.out.print(row);
			}
			System.out.println();
		}
		}

		private void printNo4() {
			/*output
			1 2 3
			1 2
			1 */
			
			for(int row=3; row>=1; row--) {
				for(int col=1; col<=row; col++)//1<=3
				{
					System.out.print(col+" ");
				}
				System.out.println();
			}
			
			
		}

		private void printNo3() {
			/*output
			1 
			2 2 
			3 3 3 */
			
			for(int row=1; row<=3; row++) {
				
				for(int col=1; col<=row; col++)
				{
				System.out.println(row+" ");
				}
				System.out.println();
			}	
		}
		private void printNo2() {
			/*output
			1 
			1 2 
			1 2 3 */
			
			for(int row=1; row<=3; row++)
			{
				for(int col=1; col<=row; col++) 
				{
					System.out.print(col+" ");
				}
				System.out.println();
			}	
		}

		private void printNo1() 
		{
			/*output
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5*/
			
			for(int row=1; row<=3; row++) 
			{
				for(int col=1; col<=5; col++)//1<=5 
	        {
					System.out.print(col + " ");
			}
				System.out.println();
			}
			
		}

		private void printNo() 
		{	
		/*output
        1 1 1 1 1
		2 2 2 2 2
		3 3 3 3 3*/
		
		for(int row=1; row<=3; row++)
		{
			for(int col=1; col<=5; col++) 
			{
				System.out.print(row + " ");
			}
			System.out.println();
		}
		}

		
		
		private void printOddEven1() 
		{
			
			/* output
			 
			 1 
             2 2 
             1 1 1 
             2 2 2 2 
             1 1 1 1 1
             
			 */
			
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%2!=0)
					{
						System.out.print("1"+" ");
					}
					else
					{
						System.out.print("2"+" ");
					}
				}
				System.out.println();
			}
		}
		
		
		
		
		public void printDiamond()
		
		{ 

			/* output
			 
		  *	       
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
			      */
			
			for(int i=1;i<=5;i++)
			{
				for(int k=5;k>=i;k--) 
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*"+" ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
						
			for(int i=4;i>=1;i--)
			{
				for(int k=5;k>=i;k--) 
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*"+" ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
		
		
		public void printDiamond1()
		
		{ 

			/* output
			 
		  1 
        2 2 2 
      3 3 3 3 3 
    4 4 4 4 4 4 4 
  5 5 5 5 5 5 5 5 5 
    4 4 4 4 4 4 4 
      3 3 3 3 3 
        2 2 2 
          1 
			      */
			
			
			for(int i=1;i<=5;i++)
			{
				for(int k=5;k>=i;k--) 
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
						
			for(int i=4;i>=1;i--)
			{
				for(int k=5;k>=i;k--) 
				{
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				for(int j=1;j<i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		
		
		
		 public void numberPattern()
		 {
			 /* output
			  
			  65 
     		  66 67 
			  68 69 70 
			  71 72 73 74 
			  75 76 77 78 79 

			  A 
			  B C 
			  D E F 
			  G H I J 
			  K L M N O 
			  
			  */
			 
			 
			 for(int i=0 ,p='A';i<5;i++)
			 {
				 for(int j=0 ,h='0';j<=i;j++)
				 {
					 System.out.print(p++ +" ");
				 }
				 System.out.println();
			 }
			 System.out.println();
			 
			 
		 
			 for(char i=0 ,p='A';i<5;i++)
			 {
				 for(char j=0 ,h='0';j<=i;j++)
				 {
					 System.out.print(p++ +" ");
				 }
				 System.out.println();
			 }
		 }
		
	}


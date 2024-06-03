package basicprogram;


public class SwapsNumber {
	int a=5;
	int b=10;
	int t=0;
	/*public void swaps()//swap two number  using three variable  program
	{
		t=a;//t=5
		a=b;//a=10
		b=t;//b=5
		System.out.println( "swap two number using three variable a is:" +a+ " b is:"+b);
	}*/
	public void swapstwovaraible()//swap two number using two variable  program
	{
		a=a+b;//5+10=15
		b=a-b;//15-10=5
		a=a-b;//15-5=10
		System.out.println( "swap two number using two variable a is:" +a+ " b is:"+b);
	}
	
	public void swapstring()
	{
		String name[]= {"muthu","raman","ram"};
		String temp;
		for(int i=0;i<=name.length-1;i++) {
		temp=name[0];
		name[0]=name[1];
		name[1]=name[2];
		name[2]=temp;
		System.out.println(name[i]);
		}
			
	}
		public static void main(String[] args) {
			SwapsNumber s=new SwapsNumber();
	//s.swaps();
			s.swapstring();
	//s. swapstwovaraible();
		}

	}

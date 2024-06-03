package oopsprogram;

public class StringTheory
{
	public StringTheory(String name)
	{
		
	}
	public static void main(String[] args) {
		StringTheory s=new StringTheory("ravi");
	    String u=new String("bat");
	    String y=new String("bat");
	    System.out.println(u==y);
	   System.out.println(u.hashCode());
	   System.out.println(y.hashCode());
	    System.out.println(y);
		String name="ddf";
		//System.out.println(s);
		String demo="hello";
		String h="hai";
		System.out.println(demo=h);
		System.out.println(demo);
		System.out.println(demo.hashCode());
		System.out.println(h.hashCode());
		StringBuffer sb=new StringBuffer("haii");
		sb.append("muthu");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}
public void stringDemo()
{

}
}

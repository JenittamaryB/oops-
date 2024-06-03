package encapsulation;

public class PersonalInformation 
{
String name="muthu";
long phno=56789876;
String dob="12-3-2001";
String college="bishop";
String degree="MCA";
public void details()
{
	System.out.println(name);
	System.out.println(dob);
}
void moreInform(){
	System.out.println(college);
	System.out.println(degree);
}
private void personal() {
	int aadhar=2345;
	int password=234;
	System.out.println(aadhar);
	System.out.println(password);
}
protected void perso() {
	System.out.println(phno);
}
public static void main(String[]args) {
	PersonalInformation pi=new PersonalInformation();
	pi.details();
	pi.moreInform();
	pi.personal();
	pi.perso();
}
}

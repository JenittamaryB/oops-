package encapsulation;


public class AccessInfo {
	public static void main(String[] args) {
		PersonalInformation obj=new PersonalInformation();
		obj.details();//this method is public
		obj.moreInform();//default method
		//obj.personal();//we cannot access personal method because it is private 
		obj.perso();//protected method
	}

}

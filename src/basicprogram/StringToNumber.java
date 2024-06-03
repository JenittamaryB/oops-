package basicprogram;

public class StringToNumber {
	public static void main(String[] args) {
        String a = "barbieb";
        System.out.println("input: "+a);
        int count= 0;
        StringBuilder ob = new StringBuilder();//default class to use append() and insert() replace() etc..

        for (char v : a.toCharArray())// it convert string  to char
        {
            if (v == 'b') {
                count++;
                ob.append(count);//append means change value
                //if b means count that
               } 
            else {
                ob.append(v);
            }
            
        }

        System.out.println("output: "+ob.toString());//return string obj
    }
}


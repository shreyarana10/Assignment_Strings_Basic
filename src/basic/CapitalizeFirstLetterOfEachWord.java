package basic;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		str = " "+ str;
		String word="";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				word+=ch;
				i++;
				
				ch = str.charAt(i);
				word=word+Character.toUpperCase(ch);
			}
			else{
				word+=ch;
			}
		}
        word = word.trim();
        System.out.println(" New String  : \n" + word);
	}

}

/* SAMPLE OUTPUT :

Enter the string : 
My name is shreya

 New String  :
My Name Is Shreya


*/

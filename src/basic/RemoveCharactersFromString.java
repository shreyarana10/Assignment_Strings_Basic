package basic;

import java.util.Scanner;

public class RemoveCharactersFromString {

	public static void main(String[] args) {
	
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		/*
		 *   s=s.replaceAll("[^a-zA-Z]","");  //Method one : 
		 */
		System.out.println("After removing all the brackets : ");
		for(int i=0;i<str.length();i++) {
			
			if (str.charAt(i) < 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z') {
				str  = str.substring(0,i)+str.substring(i+1); 
				i--;
			}
		
		}
		System.out.println(str);
	}
}


/*
   SAMPLE OUTPUT :

    Enter the String 
	Code#$%^14for$%practice567
	
	After removing all the brackets : 
	Codeforpractice


*/
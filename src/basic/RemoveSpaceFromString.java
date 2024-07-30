package basic;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
	
		
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		
		System.out.println("After Removing the Space :");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
		    if(ch ==' ') {
		    	continue;
		    }
		    System.out.print(ch);
		}
      
	}

}

/* **************************************
 *    NOTE :( ANOTHER METHOD):
 *    
 *     str = str.replaceAll("\\s", "");
 * **************************************
 */


/*******************************************
 
SAMPLE OUTPUT :

	Enter the String 
	Be The Human First
	
	After Removing the Space :
	BeTheHumanFirst

********************************************
*/
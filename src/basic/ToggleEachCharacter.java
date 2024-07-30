package basic;

import java.util.Scanner;

public class ToggleEachCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuilder toggleCharacter = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}else if(Character.isUpperCase(ch)){
				ch = Character.toLowerCase(ch);
			}
			toggleCharacter = toggleCharacter.append(ch);
		}
		System.out.println("After Toggle Each Character :\n" + toggleCharacter);
	}
}


/* SAMPLE OUTPUT :

(TEST CASE : 1) 
	Enter the String : 
	my name is shreya rana .
	
	After Toggle Each Character :
	MY NAME IS SHREYA RANA .

(TEST CASE : 2 ) 
	Enter the String : 
	MY NAME IS SHREYA RANA .
	
	After Toggle Each Character :
	my name is shreya rana .



(TEST CASE : 3)

	Enter the String : 
	my NAME IS Shreya.
	
	After Toggle Each Character :
	MY name is sHREYA.

*/
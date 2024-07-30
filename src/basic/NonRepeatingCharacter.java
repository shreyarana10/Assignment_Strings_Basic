package basic;

import java.util.LinkedHashSet;
import java.util.Scanner;
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		
		LinkedHashSet<Character> nonRepeatingCharacter =  new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				nonRepeatingCharacter.add(ch);
			}
		}
		if(nonRepeatingCharacter.isEmpty()) {
			System.out.println("There is not Non-Repeating character : ");
		}else {
			for(char ch : nonRepeatingCharacter) {
				System.out.println(ch );
			}
		}

	}

}
/*SAMPLE OUTPUT :
 
Enter the String : 
gOOD
g
D

*/
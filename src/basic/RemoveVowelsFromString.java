package basic;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =0;
		
		System.out.println("After removing all the vowels : ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
				continue;
			}
			System.out.print(ch);
		}
	}
}
/* SAMPLE OUTPUT : 

	Enter the String 
	If You win you will then your will also appreciate your efforts .
	
	After removing all the vowels : 
	f Y wn y wll thn yr wll ls pprct yr ffrts .	

*/
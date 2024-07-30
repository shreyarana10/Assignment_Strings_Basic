package basic;

import java.util.Scanner;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
				count++;
			}
		}
		System.out.println("There are ( " +  count + " ) Vowels , in your sentence .." );

	}

}

/*     SAMPLE OUTPUT : 

	Enter the String 
	I can do it .
	
	There are ( 4 ) Vowels , in your sentence ..


*/
package basic;


import java.util.Arrays;
import java.util.Scanner;


public class AnagramOrNot {

	
	public static boolean isAnagram(String str1 , String str2) {
		
		String Str1 = str1.replaceAll("\\s","");
		String Str2 = str2.replaceAll("\\s","");
		
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			return Arrays.equals(ch1, ch2);
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter second string : ");
		String str2 = sc.nextLine();
		
		boolean result = isAnagram(str1 , str2);
		if(result) {
			System.out.println("Anagram ");
		}
		else {
			System.out.println("Not Anagram ");
		}
	}
}
/*   SAMPLE OUTPUT :

1. Enter the string : 
	liv
	vli
	Anagram 


2. Enter the string : 
	abc
	def
	Not Anagram 



*/

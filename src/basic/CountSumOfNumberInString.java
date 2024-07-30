package basic;

import java.util.Scanner;

public class CountSumOfNumberInString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("The sum of Numbers present in the String is : ");
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
		    if(ch>'0' && ch<='9') {
		    	sum +=(ch-'0');         // (ch-'0')  convert a character digit to its corresponding integer value. 
		    }
		}
        System.out.println(sum);
	}

}
/*     SAMPLE OUTPUT :
		Enter the String 
		abc123efg12
		
		The sum of Numbers present in the String is : 
		9
		
		*/

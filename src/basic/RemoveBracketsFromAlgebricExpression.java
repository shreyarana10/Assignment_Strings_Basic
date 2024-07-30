package basic;

import java.util.Scanner;

public class RemoveBracketsFromAlgebricExpression {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		System.out.println("After removing all the brackets : ");
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(' ||ch==')'||ch=='{'||ch=='}'||ch=='['||ch==']') {
				continue;
			}
			System.out.print(ch);
		}

	}

}


/********************************************************************************************************
/*
 *            WE CAN DO THIS BY :
 *            String result = input.replaceAll(“[()]”, “”);                 // Replacing the brackets with “”
 *            System.out.println(result);
 */
/*********************************************************************************************************

/********************************************************
    SAMPLE OUTPUT
	Enter the String 
	(x+y)-z
	After removing all the brackets : 
	x+y-z

*********************************************************
*/
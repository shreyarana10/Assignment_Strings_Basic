package basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev="";
		for(int i=str.length()-1 ; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
        System.out.println("Reverse of String is  : \n" + rev);
	}

}
/*
 
SAMPLE OUTPUT :


Enter the String : 
Best 
Reverse of String is  : 
 tseB



*/
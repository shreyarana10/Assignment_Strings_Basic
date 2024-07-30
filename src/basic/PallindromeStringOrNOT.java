package basic;

import java.util.Scanner;

public class PallindromeStringOrNOT {

	public static void main(String[] args) {
		
		System.out.println("Enter the String / Word ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			rev+=ch;
		}
        
		if(str.equals(rev)) {
			System.out.println("PALLINDROME ");
		}else{
			System.out.println("NOT PALLINDROME : ");
			
		}
	}

}
/*
      SAMPLE OUTPUT :
       
   1. Enter the String / Word 
	  Shreya
	  NOT PALLINDROME : 
	  
   2. Enter the String / Word 
      madam
	  PALLINDROME 

	  
	  */


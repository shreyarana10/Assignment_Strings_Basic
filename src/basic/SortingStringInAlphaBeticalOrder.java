package basic;

import java.util.Scanner;

public class SortingStringInAlphaBeticalOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		char ch[]= str.toCharArray();
		
		char temp;
		for(int i=0;i<ch.length;i++) {
			
			for(int j=0;j<ch.length;j++) {
				if(ch[j]>ch[i]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
				
			}
			
		}
		for(int i=0;i<str.length();i++) {    
			System.out.print(ch[i]);
		}

	}

}

/*
  
  SAMPLE OUTPUT 
 
  Enter the string : 
	good
	dgoo
	
	         
	         */

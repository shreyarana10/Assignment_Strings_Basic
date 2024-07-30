package basic;

import java.util.Scanner;

public class CapitalizeFirstAndLastLetterOfEachWord {
void capitalize(String str) {
	str = str.trim()+" ";
	str = str.toLowerCase();
	String word ="";
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(Character.isWhitespace(ch)) {
			String word1 ="";
			for(int j=0;j<word.length();j++) {
				
				char ch1=word.charAt(j);
				if(j==0 || j==word.length()-1) {
					ch1 = Character.toUpperCase(ch1);
				}
				word1=word1+ ch1;
			}
			System.out.print(word1+" ");
			word="";
		}else{
			word=word+ch;  
		}
	}
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("New String : ");
		CapitalizeFirstAndLastLetterOfEachWord Object = new CapitalizeFirstAndLastLetterOfEachWord();
		Object.capitalize(str);
		
	}
}

/*
       SAMPLE OUTPUT : 

	Enter the string : 
	god is great
	New String : 
	GoD IS GreaT 
		
		            */

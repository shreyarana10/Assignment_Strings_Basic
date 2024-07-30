package basic;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		for(char ch = 'a' ;ch<='z';ch++) {
			int frequency =0;
			
			for(int i=0;i<str.length();i++) {
				if(ch==str.charAt(i)) {
					frequency++;
				}
			}
			System.out.println(ch+"\t"+  frequency);
		}
		
	}

}


/*
SAMPLE OUTPUT :
Enter the string : 
shreya
a	1
b	0
c	0
d	0
e	1
f	0
g	0
h	1
i	0
j	0
k	0
l	0
m	0
n	0
o	0
p	0
q	0
r	1
s	1
t	0
u	0
v	0
w	0
x	0
y	1
z	0

*/
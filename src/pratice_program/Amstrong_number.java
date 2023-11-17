package pratice_program;

import java.util.Scanner;

public class Amstrong_number {
	public static void main(String args[]) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter a number");
		int n,c,r;
		int arm=0;
		n=p.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm) {
		  System.out.println("Amstrong number");
		}else {
			System.out.println("Not Amstrong number");
		}
	}
}






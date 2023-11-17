package pratice_program;

import java.util.Scanner;

public class Evennumber_using_scanner {
	public static void main(String[]args) {
		int number,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range");
		number=sc.nextInt();
		
		for(i=0;i<=number;i++) {
		   if(i%2==0) {
			   System.out.println(i+"even number");
		   }else
		   System.out.println(i+"odd number");
			
			
		}
	}

}

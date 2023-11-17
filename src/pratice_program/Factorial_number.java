package pratice_program;

import java.util.Scanner;

public class Factorial_number {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;                  //n=4=4*3*2*1=24
	int fact=1;
	System.out.println("Enter a number");
	n=sc.nextInt();
	while(n>=1) {
		fact=fact*n;
		n=n-1;
		
	}
    System.out.println("Fctorial of given number is:"+fact);


}
}
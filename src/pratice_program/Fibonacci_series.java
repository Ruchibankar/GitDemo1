package pratice_program;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String args[]) {
		int x=0,y=1,z=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter max range");
		n=sc.nextInt();
		while(z<=n) {
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}

}

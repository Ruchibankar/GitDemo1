package pratice_program;

import java.util.Scanner;

public class Swap_no_without_using_third_variable {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("Enter a value of a");
	a=sc.nextInt();
	System.out.println("Enter a value of b");
	b=sc.nextInt();
	System.out.println("After Swapping");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("value of a is "+a);
	
	System.out.println("value of b is "+b);
	

}
}

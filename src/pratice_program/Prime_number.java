
package pratice_program;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[]args) {
	int n,count = 0,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("check particular number is prime or not");
	n=sc.nextInt();
    i=1;
	while(i<=n) {
		if(n%i==0)
			count=count+1;
      i++;
	}
	 if(count==2) {
		 System.out.println("prime number");
	 }else {
		 System.out.println("not a prime number");
	 }
	}
}
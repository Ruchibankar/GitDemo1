package pratice_program;

import java.util.Scanner;

public class prime_no_1ton {
	public static void main(String[]args) {
	int i,j,n,count,total = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter max range");
    n=sc.nextInt();
    for(i=1;i<=n;i++) {
    	count=0;
    	for(j=1;j<=i;j++) {
    		if(i%j==0)
    			count=count+1;
                
    			
    	}
    	if(count==2) {
    		System.out.println(i);
    		total = total+1;
    	}
    }
    System.out.println("total count of prime number is"+total);
	
	

}
}
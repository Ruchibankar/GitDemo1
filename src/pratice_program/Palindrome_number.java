package pratice_program;

public class Palindrome_number {
	public static void main(String args[]) {
	String name="aba";
	String rev="";
	
	
	for(int i=name.length()-1;i>=0;i--) {
		char temp=name.charAt(i);
		rev=rev+temp;
	}
	

	if(name.equals(rev)) {
		System.out.println("Number is palindrome");
		
	}else {
		System.out.println("Number is not palindrome");
	}

}
}

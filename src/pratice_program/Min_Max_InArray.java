package pratice_program;

public class Min_Max_InArray {
	public static void main(String args[]){
	 /*  int[]arr= {4,2,8,9,88,78,66};  
	   int max=arr[0];  //consider any index as a max
	   try{for(int i=0;i<=arr.length;i++) {
		   if(max<arr[i]) {
		   
			   max=arr[i];
		   }
	   }
	   }catch(Exception e) {
		   System.out.println("\n Exception caught");
	   }
	   
	   
	   System.out.println("Maximum no is:"+max);
	}

}*/
		int[]a= {4,2,8,9,88,78,66};  
		   int min=a[0];  //consider any index as a min
		   for(int i=0;i<=a.length;i++) {
			   if(min>a[i]) {
			   
				   min=a[i];
			   }
		   }
		  
		   
		   System.out.println("Maximum no is:"+min);
	}
	
}
		   
		   
		   
		   
		   
		   
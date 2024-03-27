package conditionsblock;

public class IfelseIfelsedemo {
	/* syntax of else if...else if
	  if(condition1){
	 //block of code to be executed if condition 1 is true.
	 }
	 else if(condition2) {
		 //block of code to be executed if the condition is false and condition 2 is true
	 }
	 else {
		 //block of code to be executed if the condition 1 is false and condition 2 is false
	 } 
	  
	 */
	
	public static void main(String[]args){
		 int a=15; 
		  if (a<15) {
			  System.out.println("hiii");
		  }else if (a>10) {
			  System.out.println("hello");
		  }else if (a<25) {
		  System.out.println("hi1");
		  }else {
			  System.out.println("hii2");
			  
			  
			  int marks=56;
			  if(marks>90) {
				System.out.println("distinction");
			   }else if (marks >75 && marks<90) {
				   System.out.println("first class");
			   }else if (marks>75&&marks<=75) {
				System.out.println("second class");}
			   else {
				System.out.println("fail");
			   }	  
			  
		  }		}

}
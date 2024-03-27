package ExceptionHandling;

public class demo1 {
//ArrayIndexOutOfBoundsException
	//Arithmetic Exception
	public static void main(String[]args) {
		try {
			int a=10;
			System.out.print(a/0);
		}
		catch(ArithmeticException e) {
			//to handle the exception e.printStackTrace();
			//to print the exception details
			System.out.println("Please try to access value within the range");
		}
		System.out.println("hello");
	}
}

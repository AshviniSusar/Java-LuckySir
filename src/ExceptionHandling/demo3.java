package ExceptionHandling;

public class demo3 {
public static void main(String[]args) {
	try {
		int a = 10;
		System.out.println(a/0);
	}
	catch(Exception e) {
		//to handle the exception
		System.out.println("exception handling");
	}
	{
		//this will compile time error catch vlock is already handled catch(Arithmetic exception handling");
	}
	System.out.println("hello");
}
}

package javabasics;

public class LocalAndGlobalVariable {
	int a = 10; // global variable

	public void method1() {

		int b = 10; // local-- scope is inside the method or block only
		System.out.println(b);

	}

	public void method2() {

		System.out.println(a);
		
		//this will show error bcz b is not global variable
		//System.out.println(b);

	}

	// Local

	// Global --instance variable
	public static void main(String[] args) {

	}

}

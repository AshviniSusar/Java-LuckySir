package javabasics;



	public class method {

	    // Static method
	    public static void Method1() {
	        System.out.println("hello");
	    }

	    // Non-static method
	    public void Method2() {
	        System.out.println("hello2");
	    }

	    // Static method
	    public static void method3() {
	        System.out.println("this is static method");
	    }

	    // Parameterized method
	    public void method4(String name, int age) {
	        System.out.println(name + " " + age);
	    }

	    // Non-static method for addition
	    public void addition1(int a, int b) {
	        System.out.println(a + b);
	    }

	    // Static method for addition
	    public static void addition(int a, int b) {
	        System.out.println(a + b);
	    }

	    // Method with int return type
	    public int age() {
	        int a = 5;
	        return a;
	    }

	    public int age2() {
	        int b = 5;
	        return b;
	    }

	    public void method5() {
	        addition(age(), 20);
	        addition(age2(), 6);
	    }

	    public static void main(String[] args) {
	        // Calling static method without an object
	        Method1();

	        // Creating an object of MethodDemo class
	        MethodDemo obj = new MethodDemo();

	        // Calling non-static method using an object
	        obj.method2();

	        // Calling static method using class name
	        method3();

	        // Calling parameterized method
	        obj.method4("John", 30);

	        // Calling non-static method for addition
	        obj.addition1(10, 20);

	        // Calling static method for addition
	        addition(30, 40);

	        // Calling method with int return type
	        int result = obj.age();
	        System.out.println("Returned value from age(): " + result);

	        obj.method5();
	    }
	}



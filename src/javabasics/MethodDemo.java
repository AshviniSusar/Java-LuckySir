package javabasics;

public class MethodDemo {
	
	// we have created method 1
	//non static method
			public static  void Method1() {
				System.out.println("hello");
		}
			 public void method2() {
				 System.out.println("hello2");
			 }
			 //static method
			 public static void method3() {
				 System.out.println("this is static method");
			 }
			 //parameterized method
			 public void method4 (String name,int age) {
				System.out.println(name+" "+age); 
			 }
			 public void addition1(int a,int b) {
					System.out.println(a+b);
				}
				public static void addition(int a,int b) {
					System.out.println(a+b);
				}
				//method with int return type-
				public int age() {
					int a=5;
					return a;
				}

				public int age2() {
			         int b=5;
			         return b;
			    }
				
				public void method5() {
					addition(age(),20);
					addition(age2(),6);
				}
public static void main(String[]args) {
	
	//we have to call the method 1
	//to call the method follow this steps
	//1.create the object of class
	//2.then call the method with object name.methodName
	//syntax of object:
	//    ClassName obj=new classname();
	MethodDemo obj=new MethodDemo();
	 Method1();
	//calling the method1
	//this is non static method so no need of object to call the method
	 obj.method2();		//calling the method 

	   method3();
	obj.method5();
}
	
	
}




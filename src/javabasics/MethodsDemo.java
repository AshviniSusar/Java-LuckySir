package javabasics;

public class MethodsDemo {
// we have created method 1
	//non static method
			public static  void Method1() {
				System.out.println("hello");
		}
			
			
			//we have created method 2
			//non static method                                                                                                                                                    
			public void Method2() {
				System.out.println("hello2");
			}
			
			
			//static method
			public static void method3() {
				System.out.println("this is static method ");
			}
			
			
			//parameterized method
			// rahul 30
			public void Method4(String name,int age) {
				System.out.println(name + " " + age);
			}
			
			//parameterized method static method
			//rahul30
			public static void  addition(int a,int b) {
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
			//2.then call the method with object name.methodname
			//syntax of object:
			//    ClassName obj=new classname();
			
			MethodsDemo obj=new MethodsDemo();
			 Method1();
			//calling the method1
			//this is non static method so no need of object to call the method
			obj.Method2();
			//calling the method 2
		      Method1();
			//this is static method so no need to of object to call the method
			obj.Method4("rahul",30);
             addition(45,56);
			System.out.println(obj.age());
         }
         
}	


//Notes:1  static--we dont need object
	  //2	Non-static--we need object
//ststic means call without object
//if we use int then we have to add return value compulsory
//apart from void if you are using return type then return statement is must.
//eg. static method
    //  public static int method4(){
      //  System.out.println("this is static method");}
			
		




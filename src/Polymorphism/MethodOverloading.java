package Polymorphism;

public class MethodOverloading {
//same method name with different parameters
	//rules for giving parameters
	//1.datatype should be different
	//2.count should be different
	//3.sequence should be different
	public void addition(int a,double b) {
		System.out.println(a+b);
	}
	public void addition(double b,double a) {
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		MethodOverloading obj=new MethodOverloading();
		obj.addition(12,13);
		obj.addition(12.5,13.5);
	}
}

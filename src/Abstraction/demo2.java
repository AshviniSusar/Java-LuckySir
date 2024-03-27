package Abstraction;

public class demo2 extends demo{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("hello2");
	}
	

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("hello3");
			
		}
	//object create--method body done
			public static void main (String[]args) {
				demo2 obj=new demo2();
				obj.method1();
				obj.method2();
	}

}
package Polymorphism;
	public class AxisBank extends Bank {
		//override method
		public void checkbalance() {
			System.out.println("Balance is 2000");
		}
			
		public void method2() {
			System.out.println("i am from axis bank");
			}
		public static void main(String[]args) {
			//child reference //child object
				AxisBank obj=new AxisBank();  //this will call parent and child methods(override child method will get called)
				obj.checkbalance();        //child override method
				obj.method2();           //child
				obj.method1();          //parent
				//parent ref parent object
				Bank obj1 =new Bank();   //this will call only parent methods
				obj1.checkbalance();  //1000
				obj1.method1(); // i am from bank
			}
}
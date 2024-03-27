package javabasics;

public class method2 {

    // We have created method1
    // Static method
    public static void method1() {
        System.out.println("hello");
    }

    // We have created method2
    // Non-static method
    public void method2() {
        System.out.println("hello2");
    }

    // Static method
    public static void method3() {
        System.out.println("this is a static method");
    }

    // Parameterized method
    public void method4(String name, int age) {
        System.out.println(name + " " + age);
    }

    // Method with void return type (no return)
    public void addition1(int a, int b) {
        System.out.println(a + b);
    }

    // Static method with void return type (no return)
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
        // Calling method1 using its name
        method1();

        // Creating an object of the class to call non-static methods
        MethodDemo obj = new MethodDemo();

        // Calling the non-static method2 using the object
        obj.method2();

        // Calling method1 again
        method1();

        // Calling static method3
        method3();

        // Calling the parameterized method4 with arguments
        obj.method4("John", 25);

        // Calling the non-static addition1 method with arguments
        obj.addition1(10, 20);

        // Calling the static addition method with arguments
        addition(5, 6);

        // Calling method5 using the object
        obj.method5();
    }
}

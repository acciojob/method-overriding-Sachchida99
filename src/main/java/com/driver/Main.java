package com.driver;

public class Main {
    public static class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

public static class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}
    public static void main(String[] args) {
        
        // Task 3: Create an object of class B and call method meth of class A with it
        B objB = new B();
        System.out.println("Calling method meth from class A with object of class B: " + objB.meth());

        // Task 5: Call the overridden method from object of class B
        System.out.println("Calling overridden method meth from class B: " + objB.meth());
    }
}

package Core;

public class Inheritance {
    public static void main(String[] args) {
        Parent p=new Child();
        p.staticMethod();
    }
}
class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }
    public  void Method() {
        System.out.println("Parent's static method");
    }
}
class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Child's static method");
    }
}


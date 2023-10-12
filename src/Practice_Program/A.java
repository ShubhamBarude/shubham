package Practice_Program;

public abstract class A {
    abstract void m1();
}
 class B extends A {
    protected void m1(){
        System.out.println("One");
    }
}
 class Test {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}


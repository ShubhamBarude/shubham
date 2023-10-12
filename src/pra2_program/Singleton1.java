package pra2_program;

public class Singleton1 {
    public static Singleton1 Instance=new Singleton1();
    private static Singleton1 Instancce(){

        System.out.println("it is first method:");
        return Instance;
    }
    private Singleton1(){
        System.out.println("it is constructor:");
    }

    public static void main(String[] args) {
        Singleton1 ref=Singleton1.Instancce();
    }
}

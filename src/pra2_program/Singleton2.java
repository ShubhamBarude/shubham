package pra2_program;

public class Singleton2 {
private static Singleton2 Instance=null;
private static Singleton2 Instance(){
    if(Instance==null){
        Instance=new Singleton2();
        System.out.println("it is first object:");
    }

    return Instance;
}
    private Singleton2(){
        System.out.println("it is constructor");
    }

    public static void main(String[] args) {
        Singleton2 obj=Singleton2.Instance();
        System.out.println(obj.hashCode());
        System.out.println(Instance.hashCode());
    }
}

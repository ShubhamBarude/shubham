package pra2_program;

public class Coveriant {
    int a=10;
    Coveriant add(){
        Coveriant ref=new Coveriant();
        System.out.println("it message print a:"+a);
        return ref;
    }

    public static void main(String[] args) {
        Coveriant obj=new Coveriant();
        obj.add();
    }
}

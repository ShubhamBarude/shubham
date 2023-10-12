package Practice_Program;

public class  Coverient
{
     int a=20;

    Coverient add(){
        int a=30;
        Coverient obj=new Coverient();
        System.out.println("enter a veriable:"+obj.a);
        return obj;
    }

    public static void main(String[] args) {
        Coverient obj=new Coverient();
        obj.add();

    }

}

package Practice_Program;

public class parent {
    parent add(){
        System.out.println("it is first method");
        return new parent();

    }
}
class child extends parent
{
    @Override
    parent add() {
        System.out.println("it is second method");
        return new child ();
    }

    public static void main(String[] args) {
        child obj=new child();
        obj.add();
    }
}
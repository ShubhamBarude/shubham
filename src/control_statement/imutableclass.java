package control_statement;

public class imutableclass
{
    public static void main(String[] args) {
        imutable1 obj=new imutable1("shubham");
        obj.getName();
    }

}
final class imutable1
{
    private final String name;
    imutable1(String name)
    {
        this.name=name;
        System.out.println("it is constructor");
    }

    public String getName() {
        System.out.println("it is getter method");
        return name;
    }
}

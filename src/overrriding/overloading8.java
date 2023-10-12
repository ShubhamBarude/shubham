package overrriding;

public class overloading8
{
    overloading8 display()
    {
        System.out.println("enter a method1A");
        overloading8 obj=new overloading8();
        return obj;
    }
}
class overloading08 extends overloading8
{
    overloading08 display()
    {
        System.out.println("enetr a method 1B");
        overloading08 obj1=new overloading08();
        return obj1;

    }

    public static void main(String[] args) {
        overloading8 obj=new overloading08();
        obj.display();
    }
}
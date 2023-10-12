package String;

public class Imutableclass3
{
    public static void main(String[] args) {
        Imutable3 obj=new Imutable3(20);
        obj.getId();
    }
}
final class Imutable3
{
    private final int id;
    Imutable3(int id)
    {
        this.id=id;
        System.out.println("this is constructor:"+id);
    }

    public int getId() {
        System.out.println("it is getter method:");
        return id;
    }
}
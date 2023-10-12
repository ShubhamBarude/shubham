public class hybtest5 {

    String school="deshikandra high school";
    long pincode=401151;
    boolean a=false;
    int b=60;
    public void ak(int id)
    {
        System.out.println("your id number:"+id);
    }
}
class hybtest05 extends hybtest5
{
    public int bk()
    {
        System.out.println("your school name:"+school);
        return 10;
    }
}
class hybtest005 extends hybtest5
{
    public void ck()
    {
        System.out.println("your pincode:"+pincode);
    }
}
class hybtest0005 extends hybtest005
{
    public float dk()
    {

        System.out.println("enter a boolean value:"+a);
        return 1.23f;
    }
}
class hybtest00005 extends hybtest0005
{
    public String add(int id)
    {
        int z=b+id;
        System.out.println("add :"+z);
        return "sh";
    }
}
class hybtest000005 extends hybtest00005
{
    public byte sub(byte id)
    {
        int y=b-id;
        System.out.println("sub:"+y);
        return 20;
    }
    public static void main(String args[])
    {
        hybtest000005 obj=new hybtest000005();
        obj.sub((byte)20);
        obj.add(30);
        obj.ak(10);
        obj.ck();
        obj.dk();
        hybtest05 obj1=new hybtest05();
        obj1.bk();

    }
}

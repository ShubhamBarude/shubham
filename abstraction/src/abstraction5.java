abstract class abstraction5
{
    abstract int ak(String name);
    String name="shubham";
    String car="tata";
}
abstract class abstraction05 extends abstraction5
{
    abstract String bk();
    @Override
    int ak(String name) {
        System.out.println("enter your name:"+name);
        return 0;
    }
}
class abstraction005 extends abstraction05
{
    @Override
    String bk() {
        System.out.println("enetr a car name:" + car);
        return null;
    }

    public static void main(String[] args) {
        abstraction005 obj=new abstraction005();
        obj.ak("shubham");
        obj.bk();
    }
}
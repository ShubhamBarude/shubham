interface interface11
{
    void add();
}
interface interface22 extends interface11
{
    void sub();
}
abstract class inteterface33
{
  abstract void mul();
}
class inteterface44 extends inteterface33 implements interface22,interface11
{
    @Override
    void mul() {
        System.out.println("enetr a 1A method");
    }

    @Override
    public void add() {
        System.out.println("enetr a 1B method ");
    }

    @Override
    public void sub() {
        System.out.println("enetr a method 1C");
    }

    public static void main(String[] args) {
        inteterface44 obj=new inteterface44();
        obj.add();
        obj.mul();
        obj.sub();
    }
}
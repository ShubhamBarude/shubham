public class PraHybridInher
{
    int a=20;
    int b=30;
    int c=10;
void add()
{
    int result=c+a;
    System.out.println("enter a add:"+result);
}
void mul()
{
    System.out.println("enter a multi");
}
}
class PraHybridInher1 extends PraHybridInher


{
    @Override
    void add() {
      //  super.add();
        this.sub();
        System.out.println("it is a second class method");

    }

    void mul() {
        super.mul();

    }

    void sub()
    {
        super.add();
        int result1=b-a;
        System.out.println("enter a sub:"+result1);
    }

    public static void main(String[] args) {
        PraHybridInher obj=  new PraHybridInher1();
        obj.add();
        obj.mul();



    }
}

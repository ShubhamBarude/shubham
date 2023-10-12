package Practice_Program;
 class Interfacepra5
{
    {
        System.out.println("second iib");
    }
  static   {
      System.out.println("it is second sib:");
    }
    Interfacepra5()
    {
        System.out.println("it is second constructor:");
    }
}

interface Interfacepra
{
    void add();
    static void ak()
    {
        System.out.println("enter a static method 1:");
    }
}
interface Interfacepra1
{
    void sub();
    static void bk()
    {
        System.out.println("enetr a second static method 2");
    }
}
abstract class Interfacepra2 extends Interfacepra5 {
    Interfacepra2() {
        System.out.println(" it is constructor:");
    }

    {
        System.out.println("it is iib:");
    }

    static {
        System.out.println("it is static block:");
    }

    static void zk() {
        System.out.println("it is static method 3:");
    }
}
    class Interfacepra3 extends Interfacepra2 implements Interfacepra,Interfacepra1 {
        @Override
        public void add() {
            System.out.println("it is implementation method of add");
        }

        @Override
        public void sub() {
            System.out.println("it is implementATION METHOD of sub:");
        }


    public static void main(String[] args) {
        Interfacepra3  obj=new Interfacepra3();
        obj.add();
        obj.sub();
        Interfacepra2.zk();
        Interfacepra.ak();
    }
}
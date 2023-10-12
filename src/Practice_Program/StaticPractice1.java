package Practice_Program;

public class StaticPractice1
{
    static int id;
    //final int id1=10;//final veriable must be intilize
    int id2=30;
    static void add( final int id){

        System.out.println("print a id:"+id);
    }

    public static void main(String[] args) {
        StaticPractice1 obj=new StaticPractice1();
        veru obj1=new veru();
        obj1.add();

        StaticPractice1.add(10);
        StaticPractice1.add(20);
    }
}
 class veru {                        //we can't create outer class static
    void add()
    {
        System.out.println("it is normal class");
    }
    static class akash {       //we  create outer class static
        void sub()
        {
            System.out.println("static sub method:");
        }
    }
}
class saurabh {
    static int a=10;
    final int b=20;
    int c=30;

   static void div ()   // Static method allow only static variable
    {
       // int z=a+b+c;
        System.out.println("it is static method :");
    }

    public static void main(String[] args) {
        saurabh ref5=new saurabh();
        div();      //this type is calling in same class only
        saurabh.div();// this type calling for another class
    }
}
class omya extends saurabh{
//   void div(){    // can't override static method
//
//   }
}
class vission
{
    static int a=10;
    final int b=20;
    private int c=30;
    int d=40;
     void add()      //normal method can accept all veriable
    {
        int z=a+b+c;
        System.out.println("print add:"+z);
    }

    public static void main(String[] args) {
        vission ref=new vission();
        vission ref1=new vission();
        vission ref2=new vission();


                 ref1.a=40;

        System.out.println("it is printing static variable:"+ref.a++);//40
        System.out.println("non static  variable 1:"+ref.d++);//40
//        System.out.println("final variable 1:"+ref.b++); //final is fix can't be modified
        //  System.out.println("instance variable :"+ref.d);
        System.out.println("it is printing static variable 2:"+ref1.a++);//41
        System.out.println("it is printing non static variable 2:"+ref1.d++);//40 it is taking always same value
                                                                              //because of post increment
        System.out.println("it is printing static variable 3:"+ref2.a++);     //42 it is taking updated value
        System.out.println("it is printing non static  variable 3:"+ref2.d++);//40
        ref.add();//93
    }
}
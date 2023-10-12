public class test1 {
  static   int a=60;
    int b=10;
    byte c=20;
    static int  add(){
         int  a=20;
        System.out.println("it is static veriable:"+test1.a);
return 10;
    }
    public void  ak()
    {

              int  d=a+(byte)c;
        System.out.println("enetr a addition:"+a);
    }
}

  class test01 {
}

class test001 extends test01{
    public void ck()
    {
    //    int e=a*b;
      //  System.out.println("eneter a multiply"+e);
    }
}
class test0001 extends test001 {
    public void dk() {

      //  int f = a / b;
      //  System.out.println("enter a div" + f);
    }


    public static void main(String[] args) {
        test0001 zk=new test0001();
       // zk.ak();
       // zk.bk();
        zk.ck();
        zk.dk();
        test1.add();

    }
}
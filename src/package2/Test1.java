package package2;

public class Test1 {

    int ss=7878;
    static int aa=8989;
    final int qq=5656;


     Test1(){
         System.out.println(ss);
         System.out.println(aa);
         System.out.println(qq);
         int a=89;
         final int e=8;
         int ee=77;

     }


   /* static {

        Test obj = new Test();
        System.out.println(obj.qq);
        System.out.println(obj.ss);
        System.out.println(Test.aa);
            int uu=8989898;
        System.out.println(uu);

    }*/

    /*public static double checkStatic(){
         int mob=90;
         int mm=9876;

        return 7;
    }*/
    public static void main(String [] args){
        Test1 obj = new Test1();


    }

}

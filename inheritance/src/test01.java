public class test01 {

    int  sk(int a,int b )
    {

        System.out.println("enter");
       return a+b;

    }

}

 class test1 extends test01 {
     public static void main(String args[]) {
         test1 pk = new test1();
        int result = pk.sk(100,60);
       System.out.println("h"+result);

     }
 }
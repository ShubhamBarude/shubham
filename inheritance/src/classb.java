


class Parent{
    void dummy(){
        System.out.println("this is dummy method of Parent class");
    }
   int addition(int a, int b){
       return  a+b;
   }

}

public class classb extends Parent{

    public static void main(String[] args) {
        classb b = new classb();
        b.dummy();
        int result = b.addition(100,20);
        result = result + 10;
        System.out.println(result);
        System.out.println(b.addition(100,20));


    }
}
package jAVA8Feature;
interface inter07{
    void id(int a);

}
public class Test07 implements inter07
{

    @Override
    public void id(int a) {
        System.out.println("enter id"+a);
    }

    public static void main(String[] args) {
         Test07 obj=new Test07();
         obj.id(30);
         //Anonymous class
        inter07 obj1=new inter07(){
            @Override
            public void id(int a) {
                System.out.println("Anonymous class:"+a);
            }
        };obj1.id(20);
        //Lambda Expression
        inter07 obj2=(int a) -> {
            System.out.println("Lambda expression:"+a);
        };
        obj2.id(40);
    }
}

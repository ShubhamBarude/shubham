

public class newassi5 {
    void add(int a, int b)
    {
        System.out.println("enetr a first method:"+(a+b));
    }
    int sub(short a,short b)
    {
        System.out.println("enetr a second method:"+(a-b));
        return 30;
    }
    String mul(int a,int b)
    {
        System.out.println("enetr a third method "+(a*b));
        return "shubham";
    }

    public static void main(String[] args) {
        newassi5 obj=new newassi5();
        newassi5 obj1=new newassi5();
        newassi5 obj2=new newassi5();
        obj.add(10,30);
        obj.sub((short)30,(short)10);
        obj.mul(20,30);
        obj1.sub((short)50,(short)30);
        obj1.add(30,20);
        obj1.mul(20,20);
        obj2.mul(20,30);
        obj2.add(40,20);
        obj2.sub((short)30,(short)20);



    }
}

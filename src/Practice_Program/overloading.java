package Practice_Program;

public class overloading
{
    overloading(){
        System.out.println("it is constuctor:");
    }
    static{
        System.out.println("it is static block:");
    }
    static void add(String name,int n,int a)
    {
        System.out.println("it is static method :");
    }
    {
        System.out.println("it is iib");
    }
    void add()
    {
        System.out.println("it is first method");
    }
    void add(int a,int b)
    {
        System.out.println("enter second method ");
    }
    void add(String name,int b)
    {
        System.out.println("enter a third");
    }
    void add(int a,int b,int c)
    {
        System.out.println("enter a fourth:");
    }

    public static void main(String[] args) {
        overloading obj=new overloading();
        obj.add();
        obj.add(20,30);
        obj.add("name",54);
        obj.add(10,20,20);
        overloading.add("shubham",54,32);
    }
}

public class optest4 {
    public int add(int a,int b)
    {
        System.out.println("add");
        return a+b;
    }
    public int sub(int a,int b)
    {
        System.out.println("sub");
        return a-b;
    }
    public int mul(int a,int b)
    {
        System.out.println("mul:");
        return a*b;
    }
    public int div(int a,int b)
    {
        System.out.println("div");
        return a/b;
    }
    public int rem(int a,int b)
    {
        System.out.println("rem");
        return a%b;
    }
    public static void main(String args[])
    {
        optest4 obj=new optest4();
        int res=obj.add(30,20);
        int res1=obj.sub(50,30);
        int res2=obj.mul(20,50);
        int res3=obj.div(50,20);
        int res4=obj.rem(50,20);
        System.out.println("add:"+res);
        System.out.println("sub:"+res1);
        System.out.println("mul:"+res2);
        System.out.println("div:"+res3);
        System.out.println("rem:"+res4);

    }
}

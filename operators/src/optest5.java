public class optest5 {
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int sub(int a,int b,int c)
    {
        return a-b-c;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
    public int rem(int a,int b)
    {
        return a%b;
    }
    public static void main (String args [])
    {
        optest5 obj=new optest5();
        int res=obj.add(20,30,10);
        int res1=obj.sub(50,20,10);
        int res2=obj.mul(30,20);
        int res3=obj.div(60,20);
        int res4=obj.rem(50,20);
        System.out.println("add"+res);
        System.out.println("sub"+res1);
        System.out.println("mul"+res2);
        System.out.println("div"+res3);
        System.out.println("rem"+res4);
    }
}

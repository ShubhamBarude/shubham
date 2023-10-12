package package2;

public class add {
    char ch;
    boolean ak;
    void add()
    {
        System.out.println("it is default method 1");
    }
    private void sub()
    {
        System.out.println("it is private method1");
    }
    protected void mul()
    {
        System.out.println("it is protected method 1");
    }
    public void div()
    {
        System.out.println("it is public method 1");
    }

    public static void main(String[] args) {
        add ref=new add();
        System.out.println(ref.ak);
    }

}
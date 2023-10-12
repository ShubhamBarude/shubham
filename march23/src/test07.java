public class test07 {
    byte b;
    String a;
    char c;
    public int bk(byte b, String a)
    {
        boolean d=false;
        System.out.println("enter:"+b+ " "+a);
        return 10;

    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public static void main(String args[])
    {
        test07 tk=new test07();
        tk.setA("shubham");
        tk.setC('l');
        tk.setB((byte)10);
        System.out.println(tk.getA());
        System.out.println(tk.getB());
        System.out.println(tk.getC());
    }
}

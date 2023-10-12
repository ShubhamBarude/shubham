public class test12 {
    short a=54;
    byte b=65;
    boolean c=false;
    String d="shubham";

    public int gh()
    {
        System.out.println("eneter ");
        return 32;
    }

    public short getA() {
        return a;
    }

    public void setA(short a) {
        this.a = a;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public boolean getC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    public static void main(String args[])
    {
        test12 cv=new test12();
        cv.setA(cv.a);
        cv.setB(cv.b);
        cv.setC(cv.c);
        System.out.println(cv.getA());
        System.out.println(cv.getB());
        System.out.println(cv.getD());
        System.out.println(cv.getC());
    }


}

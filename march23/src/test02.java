public class test02 {
    int x;
    String z;
    short c;
    public void cg (int a, short b)
    {
        int k=20;
        System.out.println("enetr a value:"+a+ " "+c);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public short getC() {
        return c;
    }

    public void setC(short c) {
        this.c = c;
    }
    public static void main (String args[])
    {
        test02 pk=new test02();
        pk.setC((short) 21);
        pk.setX(23);
        pk.setZ("shubham");
        System.out.println(pk.getC());
        System.out.println(pk.getX());

    }

}


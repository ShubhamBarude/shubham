public class test08 {
    int a;
    float b;
    double c;
    char d;
    String e;
    boolean f;
    byte g;
    short h;
    public int dk(int a,float b,double c,char d,String e,boolean f,byte g,short h)
    {
        System.out.println("enter"+a+ " "+b+ " "+c+ " "+d+ " "+e+" "+f+" "+g+" "+h);
        return 10;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public char getD() {
        return d;
    }

    public void setD(char d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public boolean getF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public byte getG() {
        return g;
    }

    public void setG(byte g) {
        this.g = g;
    }

    public short getH() {
        return h;
    }

    public void setH(short h) {
        this.h = h;
    }

   public static void main(String args[])
   {
       test08 vk=new test08();
       vk.setA(10);
       vk.setB(0.47f);
       vk.setC(0.89);
       vk.setD('g');
       vk.setE("cl");
       vk.setF(true);
       vk.setG((byte)65);
       vk.setH((short)96);
       System.out.println(vk.getA());
       System.out.println(vk.getB());
       System.out.println(vk.getC());
       System.out.println(vk.getD());
       System.out.println(vk.getE());
       System.out.println(vk.getF());
       System.out.println(vk.getG());
       System.out.println(vk.getH());


   }

}

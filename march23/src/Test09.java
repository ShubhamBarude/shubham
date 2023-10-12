public class Test09 {
    int n;
    float b;
    char c;
    public boolean dk()
    {
        boolean b=true;
        int n=10;
        float z=32.9f;
        char y='l';
        System.out.println("eneter"+n+ " "+z+ " "+y);
        return true;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public static void main(String args[])
    {
        Test09 jk=new Test09();
        jk.dk();
    }
}

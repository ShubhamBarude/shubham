public class test03
{
    long a;
    char b;
    public void ak( int a, char b ) {
        int n=32;
        System.out.println(" eneter a char"+a+ " "+b);
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public char getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }
    public static void main(String args[] )
    {
        test03 dk=new test03();
        dk.setA(2547);
        dk.setB('d');
        System.out.println(dk.getA());
        System.out.println(dk.getB());
    }
}

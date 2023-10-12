package encapsulation;

public class encapsulation01
{
    private int ak;
    private String bk;

    public int getAk() {
        return ak;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public String getBk() {
        return bk;
    }

    public void setBk(String bk) {
        this.bk = bk;
    }

    public static void main(String[] args) {
        encapsulation01 obj=new encapsulation01();
        obj.setBk("shubham");
        obj.setAk(20);
        System.out.println("enetr a name :"+obj.getBk());
        System.out.println("enetr a name :"+obj.getAk());
    }
}


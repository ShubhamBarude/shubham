package ArrayList;

public class ArrayList01
{
    private int flat_no;
    private String name;
    private String address;

    public ArrayList01(int flat_no, String name, String address) {
        this.flat_no = flat_no;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ArrayList01{" +
                "flat_no=" + flat_no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList01 obj=new ArrayList01(03,"shubham","latur");
    }
}

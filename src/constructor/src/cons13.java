public class cons13
{
    private int username;
    private int id;

    public cons13(int username, int id) {
        this.username = username;
        this.id = id;
    }

    @Override
    public String toString() {
        return "cons13{" +
                "username=" + username +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        cons13 obj=new cons13(56487,21);
        System.out.println("enytrt :"+obj.toString());
    }



}

public class con8 {
    private String username;
    private String password;
    private int id;
    private float value;

    public con8(String username, String password, int id, float value) {
       this.username = username;
        this.password = password;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "con8{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        con8 obj=new con8("shubham","shubh@23645",56,0.23f);
        con8 obj1=new con8("akash","hfui@6547,",87,23.14f);
        System.out.println("enetr a values:"+obj.toString());
    }

}

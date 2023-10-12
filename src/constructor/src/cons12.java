public class cons12
{
    private String add;
    private String state;
    private int pin_code;

    public cons12(String add, String state, int pin_code) {
        this.add = add;
        this.state = state;
        this.pin_code = pin_code;
    }

    @Override
    public String toString() {
        return "cons12{" +
                "add='" + add + '\'' +
                ", state='" + state + '\'' +
                ", pin_code=" + pin_code +
                '}';
    }

    public static void main(String[] args) {
        cons12 obj=new cons12("latur","mh",413512);
        System.out.println("entr values:"+obj.toString());
    }
    }



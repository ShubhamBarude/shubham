package pra2_program;

public class ImmutableString {
    public static void main(String[] args) {
        ImmutTableStr ref=new ImmutTableStr(10);
ref.getId();
    }


}
final class ImmutTableStr{
    private int id;

    public ImmutTableStr(int id) {
        this.id = id;
    }

    public int getId() {
        System.out.println("enter id:"+id);
        return id;
    }
}
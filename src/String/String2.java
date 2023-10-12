package String;

public class String2
{
    public static void main(String[] args) {
        String name="akash";
        String name1="akash";
        String name2="akashb";
        String ref=new String("akashb");
        String ref1=new String ("akash123");
        name1=name1.concat("birr");
        ref=ref.concat("biradar");
        System.out.println(ref1==name);
        System.out.println(ref==ref1);
        System.out.println(ref.equals(name));
        System.out.println(ref.equals(name2));
        System.out.println(name==name1);
        System.out.println(name1.concat(name2));
    }
}

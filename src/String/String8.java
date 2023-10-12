package String;

public class String8
{
    public static void main(String[] args) {
        String name="car";
        String name1="jeep";
        String ref=new String("shubham");
        String ref1=new String("car");
        System.out.println(ref1==name);
        System.out.println(ref==name1);
        System.out.println(ref1.equals(name));
    }
}


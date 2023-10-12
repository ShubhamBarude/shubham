package Practice_Program;

public class StringPra
{
    public static void main(String[] args) {
        String ref=new String ("akash");
        String ref2=new String("akash");
        String ref1="akash";
        String ref3="akash";
        System.out.println("it is object by using new keyword:"+ref);

        System.out.println("it is object using literal type:"+ref1);
       boolean str= ref.equals(ref1);
       boolean str1=ref==ref1;
        System.out.println("equals method:"+str);
        System.out.println("it is == :"+str1);
        System.out.println(ref.equals(ref2));
        System.out.println(ref1==ref3);
        System.out.println(ref1.equals(ref2));
        System.out.println(ref1==ref);
        System.out.println(ref.equals(ref3));
        System.out.println(ref1==ref3);
    }
}

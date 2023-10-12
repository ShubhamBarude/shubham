package Practice_Program;



import java.util.*;

public class DifferenceBetList_Set
{
    public static void main(String[] args) {
        List ok=new ArrayList();
        ok.add("shubham");
        ok.add(20);
        ok.add(0.12);
        ok.add("akash");
        ok.add(null);
        ok.add(null);
        ok.add("akash");
        System.out.println("print all list:"+ok);
        Iterator ref=ok.iterator();
        while (ref.hasNext())
        {
            System.out.println(ref.next());
        }
        ListIterator ref1=ok.listIterator();
        while (ref1.hasPrevious())
        {
            System.out.println(ref1.previous());
        }
    }
}
class set{
    public static void main(String[] args) {
        Set obj=new HashSet();
        obj.add("shubham");
        obj.add(20);
        obj.add(0.12);
        obj.add("akash");
        obj.add(null);
        obj.add(null);
        obj.add("akash");
        System.out.println("print all set:"+obj);
       Iterator ref1=obj.iterator();
      while (ref1.hasNext())
      {
          System.out.println(ref1.next());
      }


    }
}
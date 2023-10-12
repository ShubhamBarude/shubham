package Practice_Program;

import javax.xml.soap.Node;
import java.util.*;

public class Itarator02
{
    public static void main(String[] args) {
        List<String> ref=new ArrayList();
        ref.add("10");
        ref.add("15");
        ref.add("65");
        ref.add("angad");
       // Iterator obj=ref.iterator();
        ListIterator obj=ref.listIterator();
        while(obj.hasNext())
        {
           // ref.add("47");//fail fast
            obj.add("6585");//fail safe
            System.out.println("it is print elements:"+obj.next());
        }



//        for(int i=0;i<ref.size();i++)
//        {
//            System.out.println("for loop:"+ref.get(i));
//        }
//        for(String ok:ref)
//        {
//            System.out.println("for each loop"+ok);
//        }
//        while(obj.hasPrevious())
//        {
//            System.out.println(""+obj.previous());
//        }
       System.out.println("enter all list : "+ref);
   }
}

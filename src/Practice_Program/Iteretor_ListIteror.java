package Practice_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteretor_ListIteror
{
    public static void main(String[] args) {
        List ref=new ArrayList();
        ref.add(10);
        ref.add("aksh");
        ref.add("kanchan");
        ref.add("shraddha");
        ref.add("saurabh");
        ref.add("add");
        System.out.println("print a list:"+ref);
//        Iterator obj=ref.iterator();
//        while(obj.hasNext())
//        {
//            System.out.println("hasnext:"+obj.next());
//        }
        ListIterator ref1=ref.listIterator();

        while(ref1.hasNext())
        {
           ref1.add("10");
            System.out.println("has next:"+ref1.next());
          //  ref1.remove();
        }
        while(ref1.hasPrevious())
        {
            System.out.println("has previous:"+ref1.previous());
        }
        System.out.println("printing list:"+ref);
        for(int i=0;i<ref.size();i++)
        {
           //ref1.add("03");
           // System.out.println("for loop:"+ref.get(i));
        }

    }

}

package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Itrator_ListItrator 
{
    public static void main(String[] args) {
        List obj=new ArrayList();
        obj.add(12);
        obj.add("shubham");
        obj.add("akash");
        Iterator itr=obj.iterator();

        while (itr.hasNext())
        {
            System.out.println("it is while loop:"+itr.next());
        }
      //  System.out.println("print a list:"+obj);
    }
}
class ListItrator
{
    public static void main(String[] args) {
        List obj=new ArrayList();
        obj.add(10);
        obj.add("saurabh");
        obj.add("angad");
        ListIterator li=obj.listIterator();
//        li.next();
//        li.next();
//        li.next();


//        while (li.hasPrevious())
//        {
//            System.out.println("it is previous method:"+li.previous());
//        }
//        System.out.println();

//        while(li.hasNext())
//        {
//            System.out.println("it is next loop:"+li.next());
//        }
//        li.add(36);
//        System.out.println(obj);
//
//        li.set(20);
//        System.out.println(obj);
//

        System.out.println(obj);
    }
}

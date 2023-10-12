package Practice_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class  Itarator1
{
    public static void main(String[] args) {
        List obj=new ArrayList();
        obj.add("shubham");
        obj.add("vijay");
        obj.add(30);
        Iterator itr1=obj.iterator();

        while(itr1.hasNext())
        {
           //  obj.add(10);
            System.out.println("it is first while next method:"+itr1.next());
        }
    }

}
class ListItarator
{
    public static void main(String[] args) {

        List <String>obj=new ArrayList();

        obj.add("shubham");
        obj.add("vijay");
       // obj.add(30);
        ListIterator itr2=obj.listIterator();
        for(String s: obj){
            System.out.println("foreach:"+s);
        }
        for(int i=0;i<obj.size();i++)
        {
            System.out.println("for loop:"+obj.get(i));
        }
        while(itr2.hasNext())
        {
            System.out.println("it is first while next method:"+itr2.next());
        }
//        itr2.next();
//        itr2.next();
//        itr2.next();
        while(itr2.hasPrevious())
        {
            System.out.println("it is previous:"+itr2.previous());
        }

        itr2.set(41);
        System.out.println(obj);
    }
}



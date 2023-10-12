package Collection;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1
{
    public static void main(String[] args) {
        ArrayList obj=new ArrayList<>();
        obj.add(66);
        obj.add(100);
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        System.out.println("it is first message:"+obj);
        ArrayList obj1=new ArrayList();
        obj1.add(500);

       Iterator itr=obj.iterator();
       while (itr.hasNext())
           System.out.println("enter:"+itr.next());
        System.out.println("it is get method:"+obj.get(2));
        System.out.println("it is remove method:"+obj.remove(1));
        System.out.println("it is set method: "+obj.set(2,50));
        System.out.println("it is addall method:"+obj.addAll(obj1));
        System.out.println("it is contains method:"+obj.contains(10));
        System.out.println("it is size method:"+obj.size());
       System.out.println("it is indexof method:"+obj.indexOf(60));
        System.out.println("it is empaty method;"+obj.isEmpty());



        System.out.println(obj);


    }
}

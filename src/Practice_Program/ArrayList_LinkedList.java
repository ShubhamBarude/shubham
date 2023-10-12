package Practice_Program;
import java.util.*;
public class ArrayList_LinkedList    //ArrayList
{
    public static void main(String[] args) {
        ArrayList obj=new ArrayList<>();//it is store only similar types of data
        obj.add(68);
        obj.add("shubham");//it is follows insertion order
        obj.add(20);                      // it doesn't follow sorting order
        obj.add(60);
        obj.add(0.123);
        obj.add('s');
        obj.add(5646898462348465l);
        System.out.println("it is first message:"+obj);
        List obj1=new ArrayList<>();
        obj1.add(10);
        obj1.add("akash");
        System.out.println("it is second message:"+obj1);
    }
}
class Linked_List            //LinkList
{
    public static void main(String[] args) {
        LinkedList obj=new LinkedList(); //it is used to store any type of data
        obj.add("shubham");
        obj.add(12);
        obj.add(0.12345);
        obj.add('d');
        obj.add(68641534846478649l);
        System.out.println("it is second class first message :"+obj);
        LinkedList<Integer> obj1=new LinkedList<>();
        obj1.add(36);
        System.out.println("it is second class second message"+obj1);
        List ok=new LinkedList<>();
        ok.add("shubham");
        ok.add('k');
        System.out.println("it is second class third message"+ok);
    }
}
class map                           //Map
{
    public static void main(String[] args) {
        HashMap obj=new HashMap();//it can store different type of data
        obj.put(123,"shubham");
        obj.put(111,"saurabh");
        obj.put("akash",01);
        obj.put("akash",036);
        obj.put(0.235,879764876498l);
        System.out.println("it is third class first message:"+obj);
        Map<Integer,String> obj1=new HashMap<>();
        obj1.put(2365,"java");
        obj1.put(60,"akash");
        obj1.put(04,"vision");
        obj1.put(02,"akash");
        obj1.put(01,"saurabh");
        obj1.put(03,"angad");
        obj1.put(05,"vijay");

        System.out.println("it is third class second message:"+obj1);//it doesn't follow sorting & insertion order
    }
}
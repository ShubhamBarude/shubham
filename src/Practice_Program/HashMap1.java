package Practice_Program;

import java.util.*;

public class HashMap1
{
    public static void main(String[] args) {
        Map<String,String> obj=new HashMap<>();
        obj.put("01","saurabh");
        obj.put("02","veer");
        obj.put("03","akash");
        obj.put("04","shraddha");
        obj.put("05","vijay");
        obj.put("06","angad");
        obj.put("07","akshy");
        obj.put("08","vishal");
        obj.put("09","shubham");
        obj.put("10","nila");
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        List obj1=new LinkedList(obj.keySet());
        System.out.println(obj1);
        List obj3=new LinkedList(obj.values());
        System.out.println(obj3);

        Collections.sort(obj1);
        System.out.println(obj1);
        Collections.sort(obj3);
        System.out.println(obj3);


    }
}

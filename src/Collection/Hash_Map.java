package Collection;

import java.util.*;

public class Hash_Map
{
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Hashtable hash=new Hashtable();
        map.put("584","veer");
        map.put("123","shubham");
        map.put("234","onkar");
        map.put("345","saurabh");
        map.put("345","angad");


        System.out.println("enter a first list:"+map);
        System.out.println("jyvbub:"+map.size());
        System.out.println("hujd:"+map.get("345"));
        //System.out.println("uggc:"+map.remove("345"));
        System.out.println("gfc:"+map);
        System.out.println("kjd:"+map.hashCode());
        System.out.println("wkj:"+map.replace("123","onkar"));
       // System.out.println("tre"+map);
        System.out.println("containskey:"+map.containsKey("123"));
        System.out.println("contains value:"+map.containsValue("angad"));
        System.out.println("print values :"+map.values());
        System.out.println("print keys:"+map.keySet());
        System.out.println("entry set:"+map.entrySet());
        System.out.println("enter a map list:"+map);
      //  map.clear();
        System.out.println("checking for it is empty :"+map.isEmpty());
       // System.out.println("lop:"+map.);
    }
}

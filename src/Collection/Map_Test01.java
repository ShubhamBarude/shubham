package Collection;

import jAVA8Feature.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Test01
{
    public static void main(String[] args) {

        Map obj = new HashMap();
       
        obj.put(null,"saurabh");
        obj.put(1,"shubham");
        System.out.println(obj.hashCode());
        System.out.println(obj);
    }
}

package pra2_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class ListToMap {
    private int id;
    private String name;

    public ListToMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List ref=new ArrayList<>();
        ref.add(10);
        ref.add("shubhm");
        Map<Integer,String> obj=new HashMap<>();
//        for(ListToMap ll:ref){
//obj.put(ll.getId(),ll.getName());
//
//        }
//        System.out.println(obj);
   }
}

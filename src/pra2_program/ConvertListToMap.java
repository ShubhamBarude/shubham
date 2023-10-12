package pra2_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {
    private int sid;
    private String sFirstName;

    public ConvertListToMap(int sid, String sFirstName) {
        this.sid = sid;
        this.sFirstName = sFirstName;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public static void main(String[] args) {
        List<ConvertListToMap> ref=new ArrayList<>();
        ref.add(new ConvertListToMap(1,"akash"));
        ref.add(new ConvertListToMap(2,"onkar"));
        ref.add(new ConvertListToMap(3,"mahesh"));
        Map<Integer,String> obj=new HashMap<>();
for(ConvertListToMap obj1:ref){

    obj.put(obj1.getSid(), obj1.getsFirstName());

}
        System.out.println("it is map:"+obj);
    }

}

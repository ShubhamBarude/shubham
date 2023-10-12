package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 implements Comparable<ArrayList2>
{
    private int id;
    private long mob_no;
    private String name;

    @Override
    public String toString() {
        return "ArrayList2{" +
                "id=" + id +
                ", mob_no=" + mob_no +
                ", name='" + name + '\'' +
                '}';
    }

    public ArrayList2(int id, long mob_no, String name) {
        this.id = id;
        this.mob_no = mob_no;
        this.name = name;
    }

    public static void main(String[] args) {
      List<ArrayList2> obj=new ArrayList<>(1);
obj.add(new ArrayList2(10,546879764l,"shubham"));
obj.add(new ArrayList2(11,98745621248l,"akash"));
        Collections.sort(obj);
        for(ArrayList2 s:obj)
            System.out.println(s);
        }


    @Override
    public int compareTo(ArrayList2 o) {
        return this.name.compareTo(o.name);
    }
}


package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class comparable1 implements Comparator<comparable> {


    @Override
    public int compare(comparable o1, comparable o2) {
        return o1.getId()-(o2.getId());
    }
}
class comparable2 implements Comparator<comparable>
{

    @Override
    public int compare(comparable o1, comparable o2) {
        if(o1.getMob()>o2.getMob()){
        return 1;}
        else if(o1.getMob()<o2.getMob()){
            return -1;}
        return 0;

    }

}
class comparable implements Comparable<comparable> {
    private String name;
    private int id;
    private long mob;
    private char serial;

//    comparable() {
//
//    }

    public comparable(String name, int id, long mob, char serial) {
        this.name = name;
        this.id = id;
        this.mob = mob;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMob() {
        return mob;
    }

    public void setMob(long mob) {
        this.mob = mob;
    }

    public char getSerial() {
        return serial;
    }

    public void setSerial(char serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "ComparableAndComparator{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mob=" + mob +
                ", serial=" + serial +
                '}';
    }


    @Override
    public int compareTo(comparable o) {
        return this.name.compareTo(o.name);
    }
}


public class ComparableAndComparator {
    public static void main(String[] args) {
        comparable obj=new comparable("shubham",20,78965412l,'g');
        comparable obj1=new comparable("akash",11,8974512659l,'a');
        comparable obj2=new comparable("ram",13,963251478l,'p');
        comparable obj3=new comparable("aniket",14,125469873l,'k');
        comparable obj4=new comparable("veer",15,69874512l,'y');
        List<comparable> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        Collections.sort(list);
        System.out.println(list);
        comparable1 comparator1=new comparable1();
        Collections.sort(list,comparator1);
        System.out.println("second:"+list);
        comparable2 comparator2=new comparable2();
        Collections.sort(list,comparator2);
        System.out.println(list);
    }

}

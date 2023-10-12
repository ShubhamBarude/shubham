package Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class emp1 implements Comparator<emp>
{

    @Override
    public int compare(emp o1, emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class emp2 implements Comparator<emp>
{


    @Override
    public int compare(emp o1, emp o2) {
        return o1.getId()-(o2.getId());
    }
}
class emp3 implements Comparator<emp>
{

    @Override
    public int compare(emp o1, emp o2) {
        return o1.getLast_Name().compareTo(o2.getLast_Name());
    }
}

class emp implements Comparable<emp>
{
    private String Name;
    private int id;
    private long mob_no;
    private String Add;
    private String Last_Name;
    private String Middle_Name;
    emp(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMob_no() {
        return mob_no;
    }

    public void setMob_no(long mob_no) {
        this.mob_no = mob_no;
    }

    public String getAdd() {
        return Add;
    }

    public void setAdd(String add) {
        Add = add;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getMiddle_Name() {
        return Middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        Middle_Name = middle_Name;
    }

    @Override
    public String toString() {
        return "emp{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", mob_no=" + mob_no +
                ", Add='" + Add + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Middle_Name='" + Middle_Name + '\'' +
                '}';
    }

    public emp(String name, int id, long mob_no, String add, String last_Name, String middle_Name) {
        Name = name;
        this.id = id;
        this.mob_no = mob_no;
        Add = add;
        Last_Name = last_Name;
        Middle_Name = middle_Name;
    }

    @Override
    public int compareTo(emp o) {
        return this.Name.compareTo(o.Name);
    }
}

public class ArrayList3
{
    public static void main(String[] args) {
        emp obj=new emp("shubham",11,6484664874l,"latur","barude","ramesh");
        emp obj1=new emp("Akash",22,648462668467l,"udgir","biradar","umakant");
        emp obj2=new emp("Saurab",44,846483486l,"Beed","Ingale","Shankar");
        emp obj3=new emp("Omkar",33,362514789741l,"Nanded","Bijjamwar","Gajanan");
        emp obj4=new emp("Aniket",55,897456321l,"latur","reddy","ramesh");
        emp obj5=new emp("Ravi",66,9632514654l,"latur","panchal","waman");
        List<emp> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        Collections.sort(list);
       // for(emp s:list)
        System.out.println("first:"+list);
        emp1 comparator1=new emp1();
        Collections.sort(list,comparator1);
        System.out.println("second:"+list);
        emp2 comparator2=new emp2();
        Collections.sort(list,comparator2);
        System.out.println("third:"+list);
        emp3 comparator3=new emp3();
        Collections.sort(list,comparator3);
        System.out.println("fourth:"+list);


    }
}

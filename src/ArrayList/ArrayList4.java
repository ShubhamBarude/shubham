package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList4
{
    private int roll_no;
    private String Department;
    private String Name;

    @Override
    public String toString() {
        return "ArrayList4{" +
                "roll_no=" + roll_no +
                ", Department='" + Department + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    public ArrayList4(int roll_no, String department, String name) {
        this.roll_no = roll_no;
        Department = department;
        Name = name;
    }

    public static void main(String[] args) {
        List <ArrayList4> obj1=new ArrayList<>();
        obj1.add(new ArrayList4(10,"mech","shubham"));
        obj1.add(new ArrayList4(20,"civil","akash"));
        obj1.add(new ArrayList4(30,"comp","veer"));
       // Collections.sort(obj1);

    }

  //  @Override
    public int compareTo(ArrayList4 o) {
        return this.Name.compareTo(o.Name);
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}

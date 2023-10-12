package Practice_Program;

import java.util.*;

public class Employe1 implements Comparable<Employe1>
{
private int emp_id;
private String Name;
private String last_name;

    public Employe1(int emp_id, String name, String last_name) {
        this.emp_id = emp_id;
        Name = name;
        this.last_name = last_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Employe1{" +
                "emp_id=" + emp_id +
                ", Name='" + Name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<Employe1, String> obj=new HashMap();
       obj.put(new Employe1(01,"shubham","barude"),"ok");
        obj.put(new Employe1(04,"akash","biradar"),"done");
        obj.put(new Employe1(03,"akshay","dhole"),"good");
        obj.put(new Employe1(02,"shraddha","ghogare"),"dp");
        List ref=new ArrayList(obj.keySet());

        Collections.sort(ref);
        System.out.println(ref);
    }

    @Override
    public int compareTo(Employe1 o) {
        return this.getEmp_id()-o.getEmp_id();
    }
}

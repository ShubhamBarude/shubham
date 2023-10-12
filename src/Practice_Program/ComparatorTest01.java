package Practice_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest01 {
    public static void main(String[] args) {
        param ok=new param("param",10);
        param ok1=new param("saurab",9);
        param ok2=new param("akash",6);
        List<param> done= new ArrayList<>();
        done.add(ok);
        done.add(ok1);
        done.add(ok2);
        Collections.sort(done);
        System.out.println(done);
        id_num done1=new id_num();
        Collections.sort(done,done1);
        System.out.println(done);
    }
}
class id_num implements Comparator<param>{

    @Override
    public int compare(param o1, param o2) {
        return o1.getA()-o2.getA();
    }
}
class param implements Comparable<param>{
    private String name;
    private int a;
    public param(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "param{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }

    @Override
    public int compareTo(param o) {
        return this.getName().compareTo(o.getName());
    }
}
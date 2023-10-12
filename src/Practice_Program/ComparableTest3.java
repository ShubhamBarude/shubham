package Practice_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest3 {

    public static void main(String[] args) {
        veer done=new veer("onkar","gajanan","bijjamwar",98);
        veer done1=new veer("veer","shiv","karbhari",21);
        veer done2=new veer("param","shiva","nila",33);
        veer done3=new veer("akash","umakant","biradar",11);
       List<veer> ok=new ArrayList<>();
       ok.add(done);
        ok.add(done1);
        ok.add(done2);
        ok.add(done3);
       Collections.sort(ok);
        System.out.println(ok);
    }
}

class akash implements Comparable<veer> {
    private String first_name;
    private String middle_name;
    private String Last_name;
    private int id;

    public akash(String first_name, String middle_name, String last_name, int id) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        Last_name = last_name;
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "akash{" +
                " first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(veer o) {
        return this.getFirst_name().compareTo(o.getFirst_name());
    }
}
package pra2_program;


import java.util.*;

class comprable implements Comparable<comprable>{
    private String name;
    private String last_name;
    comprable(String name, String last_name){
        this. name=name;
        this. last_name=last_name;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getlast_name(){
        return last_name;
    }
    public void setlast_name(String last_name){
        this.last_name=last_name;
    }

    @Override
    public String toString() {
        return "comprable{" +
                "name'" + " "+name + " " +
                ", last_name'" + " "+last_name + " " +
                '}';
    }

    public int compareTo(comprable o){
        return this.getName().compareTo(o.name);
    }
}
class comp1 {
    public static void main (String args[]){
        comprable ref=new comprable("shubham","barude");
        comprable ref1=new comprable("akash","biradar");
        comprable ref2=new comprable("saurabh","ingale");
        comprable ref3=new comprable("onkar","bijjamwar");
        List<comprable> obj=new ArrayList<>();
        obj.add(ref);
        obj.add(ref1);
        obj.add(ref2);
        obj.add(ref3);
        Collections.sort(obj);
        System.out.println("print list:"+obj);
    }
}
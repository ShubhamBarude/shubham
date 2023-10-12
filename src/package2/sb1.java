package package2;

import java.util.*;

class Shubham implements Comparable<Shubham>{
    private String name1;
    private int id;
    private long mobn;

    public Shubham(String name1,int id,long mobn){
        this.name1=name1;
        this.id=id;
        this.mobn=mobn;
    }
    public String getName1(){
        return name1;
    }
    public void setName1(String name1){
        this.name1=name1;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public long getMobn(){
        return mobn;
    }
    public void setName(long mobn){
        this.mobn=mobn;
    }

    public String toString(){
        return "shubham{"+"Firstname="+name1+" "+"id="+id+" "+"mobileno="+mobn+" "+"}";
    }

    public int compareTo(Shubham o){

        return this.getName1().compareTo(o.name1);

    }

}
public class sb1{
    public static void main(String args[]){
        Shubham obj=new Shubham("shubham",52,365484548l);
        Shubham obj1=new Shubham("angad",51,89654213l);
        Shubham obj2=new Shubham("akash",50,9632145l);
        Shubham obj3=new Shubham("onkar",49,11236548l);
        List<Shubham> ref=new ArrayList<Shubham>();
        ref.add(obj);
        ref.add(obj1);
        ref.add(obj2);
        ref.add(obj3);
        System.out.println("print a list:"+ref);
        Collections.sort(ref);
        System.out.println("print a list:"+ref);

    }
}
package pra2_program;

import java.util.ArrayList;
import java.util.List;

public class FunctionInterfaceTest1 {
    public static  void main(String[] args) {
        List<Student> obj=new ArrayList<Student>();
         obj.add(new Student(111,"akash",74,"math"));
        obj.add(new Student(112,"shubham",64,"marathi"));
        obj.add(new Student(113,"onkar",84,"english"));
        obj.add(new Student(114,"shraddha",101,"Environment"));
        obj.add(new Student(115,"kanchan",78,"sanskrit"));
//        predicate<Student> ref=(Student )
//        System.out.println(obj);
        Lambda obj1=new Lambda() {
            @Override
            public void add(int a,int b) {

                System.out.println("it is anonymous "+(a+b));
            }
        };obj1.add(10,20);//anonymous class
        //lambda expression
        Lambda obj3=(int a,int b)->{

            System.out.println("it is lambda expression:"+(b-a));
        };obj3.add(20,60);


    }

}
class FirstClass implements Lambda{

    @Override
    public void add(int a, int b) {
        System.out.println("it is first method:"+(a+b));
    }

    public static void main(String[] args) {
        FirstClass obj4=new FirstClass();
        obj4.add(50,60);
    }
}
class SecondClass implements Lambda{

    @Override
    public void add(int a, int b) {
        System.out.println("it is second abstract method:"+(b+a));
    }

    @Override
    public void sub() {
        int b=50;
        int a=20;
        System.out.println("it is default method :"+(b-a));
        Lambda.super.sub();
    }

    public static void main(String[] args) {
        SecondClass ref4=new SecondClass();
        ref4.add(100,200);
        ref4.sub();
    }
}
@FunctionalInterface
interface Lambda{
    void add(int a,int b);
    default void sub(){
        int a=70;
        int b=30;
        System.out.println("it is second method :"+(b-a));
    }
    static void div(int a,int b){
        System.out.println("it is static ");
    }


}
class ThirdClass implements Lambda{


    @Override
    public void add(int a, int b) {
        System.out.println("Third class abstract method :");
    }

    @Override
    public void sub() {
        System.out.println("third class default method :");
        Lambda.super.sub();
    }

    public static void main(String[] args) {
        ThirdClass ref5=new ThirdClass();
        ref5.add(65,58);
        ref5.sub();
        Lambda.div(89,65);
    }
}
class Student{
    int id;
    String name;
    double percentage;
    String sub;
    public Student(int id,String name,double percentage,String sub){
        this.id=id;
        this.name=name;
        this.percentage=percentage;
        this.sub=sub;
    }
public int getId(){
        return id;
}
public String getName(){
        return name;
}
public double getPercentage(){
        return percentage;
}
public String getSub(){
        return sub;
}
public String toString(){
        return id+"-"+name+"-"+percentage+"-"+sub;

}

    public static void main(String[] args) {
        List<Student> obj=new ArrayList<Student>();

    }

}
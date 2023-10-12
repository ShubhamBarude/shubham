package jAVA8Feature;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1 {
    int id ;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List <Employee1> ref=new ArrayList<>();
                ref.add(new Employee1(10,"shraddha",11,"female","civil",2010,54800d));
        ref.add(new Employee1(11,"kanchan",20,"female","it",2011,54900d));
        ref.add(new Employee1(12,"saurab",21,"male","civil",2012,54400d));
        ref.add(new Employee1(13,"akash",22,"male","civil",2013,54300d));
        ref.add(new Employee1(14,"onkar",19,"male","it",2014,54200d));
//List<Employee1> obj=ref.stream().collect(Collectors.toList());
//        System.out.println("it is converting stream to list:"+obj);
//        ref.stream().map(Employee1::getDepartment).distinct().forEach(System.out::println);//it is printing department
//        Set<Employee1> obj1=ref.stream().collect(Collectors.toSet());
//        System.out.println("it is converting in to set:"+obj1);
//        Map obj3=ref.stream().collect(Collectors.toMap(Employee1::getId,Employee1::getAge));
//        System.out.println("data converting in to map:"+obj3);
//List<Employee1> obj2=ref.stream().collect(Collectors.toCollection(LinkedList::new));
//        System.out.println("it is convert in LinkedList:"+obj2);
        Map<String,Integer> obj4=ref.stream().collect(Collectors.toMap(Employee1::getName,(Employee1 s)->s.getName().length()));
        System.out.println("it is printing string and length of that string:"+obj4);
        String obj5=ref.stream().map(Employee1::getName).collect(Collectors.joining(" # "));
        System.out.println("it is print # between to string:"+obj5);
        long obj6=ref.stream().collect(Collectors.counting());
        System.out.println("it print a count:"+obj6);
        Map<String,Optional<Employee1>> ok=ref.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));
        System.out.println("it is  group of element and print max value:"+ok);
        Optional<Double> obj12=ref.stream().map(Employee1::getSalary).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println("it is printing max salary:"+obj12);
        Optional<Integer> obj13=ref.stream().map(Employee1::getAge).collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println("it is printing min age :"+obj13);
        Map<String ,Optional<Employee1>> obj7=ref.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.minBy(Comparator.comparing(Employee1::getSalary))));
        System.out.println("it is group of elemnet and print min value:"+obj7);
        Double obj8=ref.stream().collect(Collectors.summingDouble(Employee1::getSalary));
        System.out.println("it is addition of salary:"+obj8);
        Integer obj9=ref.stream().collect(Collectors.summingInt(Employee1::getAge));
        System.out.println("it is print age:"+obj9);
         Stream.of("shubham","akash","onkar","shraddha").limit(3).skip(1).forEach(System.out::println);
       Double obj10=ref.stream().collect(Collectors.averagingDouble(Employee1::getSalary));
        System.out.println("it is printing average of salary:"+obj10);
        Double obj11=ref.stream().collect(Collectors.averagingInt(Employee1::getAge));
        System.out.println("it is printing of average age:"+obj11);
       DoubleSummaryStatistics obj14=ref.stream().collect(Collectors.summarizingDouble(Employee1::getSalary));
        System.out.println("it is printing max value:"+obj14.getMax());
        System.out.println("it is printing min value:"+obj14.getMin());
        System.out.println("it is printing average a value:"+obj14.getAverage());
        System.out.println("it is printing a sum of avlue"+obj14.getSum());
        IntSummaryStatistics obj15=ref.stream().collect(Collectors.summarizingInt(Employee1::getAge));
        System.out.println("it is printing max age:"+obj15.getMax());
        System.out.println("it is printing min age:"+obj15.getMin());
        System.out.println("it is printing average of age:"+obj15.getAverage());
   OptionalInt obj16=Arrays.stream(new int[]{1,2,3,5,9,}).reduce((a,b)->a+b);
        System.out.println("it is printing sum:"+obj16);
        OptionalInt obj17=Arrays.stream(new int[]{10,20,30}).min();
        System.out.println("it is printing min value:"+obj17);
        OptionalInt obj18=Arrays.stream(new int[]{10,20,30}).max();
        System.out.println("it is printing max value:"+obj18);
        //long obj19=ref.stream().filter((String s)->s.length()>5).count();


    }
}

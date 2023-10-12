package jAVA8Feature;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Employee {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;


    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
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
        return "Employee{" +
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
        List<Employee> ref = new ArrayList<Employee>();
        ref.add(new Employee(111, "saurabh", 01, "male", "HR", 2011, 25000.0));
        ref.add(new Employee(122, "akash", 02, "male", "Sales And Marketing", 2015, 13500.0));
        ref.add(new Employee(133, "saurabh1", 03, "female", "Infrastructure", 2012, 18000.0));
        ref.add(new Employee(144, "priya", 04, "female", "Product Development", 2014, 32500.0));
        ref.add(new Employee(155, "akash1", 05, "male", "HR", 2013, 22700.0));
        ref.add(new Employee(166, "pooja", 06, "female", "Security And Transport", 2016, 10500.0));
        ref.add(new Employee(177, "geeta", 07, "female", "Account And Finance", 2010, 27000.0));
        ref.add(new Employee(188, "mahesh", 8, "male", "Product Development", 2015, 34500.0));
        ref.add(new Employee(199, "kavya", 9, "female", "Sales And Marketing", 2016, 11500.0));
        ref.add(new Employee(200, "dipak", 10, "male", "Security And Transport", 2015, 11000.5));
//        Map<String,Long> ref1=ref.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//        System.out.println("enter a count of gender:"+ref1);
//        List obj=ref.stream().collect(Collectors.toList());
//        System.out.println(""+obj);
//        ref.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);//it is printing print department
//        List obj=ref.stream().collect(Collectors.toList());
//        System.out.println("it is save in to list "+obj);
//        Set obj1=ref.stream().collect(Collectors.toSet());
//        System.out.println("it is save in to set"+obj1);
//        Map obj2=ref.stream().collect(Collectors.toMap(Employee::getId ,Employee::getSalary));
//        System.out.println("it is save in to map:"+obj2);
//        List obj3=ref.stream().collect(Collectors.toCollection(LinkedList::new));
//        System.out.println("it is printing specific list:"+obj3);//
//       String obj4=ref.stream().map(Employee::getId).collect(Collectors.joining(","));
//        System.out.println(obj4);
//        Map<String,Integer> ref1=ref.stream().collect(Collectors.toMap(Employee::getName,((Employee s)->s.getName().length())));
//        System.out.println("it is printing name and length of specific string length"+ref1);
//        String obj4=ref.stream().map(Employee::getName).collect(Collectors.joining(","));
//        System.out.println("it is join operation:"+obj4);
//        long obj5=ref.stream().collect(Collectors.counting());
//        System.out.println("it is printing counting :"+obj5);
  //      Optional<Double> obj6=ref.stream().map(Employee::getSalary).collect(Collectors.maxBy(Comparator.naturalOrder()));
//       System.out.println("it is printing max salary :"+obj6);
//        Map<String,Optional<Employee>> ok=ref.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println("it is  group of element and print max value"+ok);
//        Optional<Double> obj7=ref.stream().map(Employee::getSalary).collect(Collectors.minBy(Comparator.naturalOrder()));
//        System.out.println("it is printing min number:"+obj7);
   //     Double obj8=ref.stream().collect(Collectors.summingDouble(Employee::getSalary));
//        System.out.println("Sum of salary:"+obj8);
//        Integer obj9=ref.stream().collect(Collectors.summingInt(Employee::getAge));
//        System.out.println("sum of age:"+obj9);
//        Stream.of("akash","dipak","shubham").limit(2).skip(1).forEach(System.out::println);
//        Double obj10=ref.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println("it is printing average of salary:"+obj10);
//        Double obj11=ref.stream().collect(Collectors.averagingInt(Employee::getAge));
//        System.out.println("it is printing age:"+obj11);
     //   DoubleSummaryStatistics obj12=ref.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("maximum salary:"+obj12.getMax());
//        System.out.println("minimum salary:"+ obj12.getMin());
//        System.out.println("average of salary:"+ obj12.getAverage());
//        IntSummaryStatistics obj13=ref.stream().collect(Collectors.summarizingInt(Employee::getAge));
//        System.out.println("max age:"+obj13.getMax());
//        System.out.println("min age:"+obj13.getMin());
//        System.out.println("average of age:"+obj13.getAverage());//it is given output in double because get average methods
//                                                                  //is returns Double
// ??   Map<String , List<Employee>> obj14=ref.stream().collect(Collectors.groupingBy((Employee s)->s.getDepartment()));
//        System.out.println("it is printing name department"+obj14);
       Map<Boolean,List<Employee>> obj15=ref.stream().collect(Collectors.partitioningBy((Employee s)->s.getSalary()>20000));
        System.out.println("it is printing above :"+obj15);
//??      List<Employee> obj16=ref.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(),Collectors.Collections::unmodified));
//        ref.forEach(System.out::println);
//        System.out.println("-----------------------------------------------------------------------------------------------");
//       Comparator<Employee> obj=Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
//
//Collections.sort(ref,obj);
//        ref.forEach(System.out::println);


//        Comparator<Employee> obj1= Comparator.comparing()
        }


    }


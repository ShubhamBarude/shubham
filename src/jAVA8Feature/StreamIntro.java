package jAVA8Feature;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntro {
    public static void main(String[] args) {
        List<String> ok = new ArrayList();
        ok.add("saurabh");
        ok.add("akash");
        ok.add("angad");
        ok.add("vijay");
        ok.add("veer");
        ok.add("ad");
         ok.add("akash");


//        List<String> ref=ok.stream().filter(s -> s.startsWith("a")).distinct().collect(Collectors.toList());
       // ok.stream().distinct().forEach(System.out::println); //enter unique element
        // ok.stream().limit(3).forEach(System.out::println);// it showing first two length
        // ok.stream().map(String::length).forEach(System.out::println);//it print a count of character
        //ok.stream().sorted().forEach(System.out::println);//sorting order
       //  ok.stream().sorted((String s1,String s2) -> s1.length()-s2.length()).forEach(System.out::println);//it is sorting according to length
        // ok.stream().skip(2).forEach(System.out::println);//it is skip first two length
//ok.stream().sorted().forEach(System.out::println);//sorting order
//        if (ok.stream().anyMatch((String name) -> name.length() == 4))
//        {
//            System.out.println("yes it is  length of char is 4 true:");
//        }
//        else
//        {
//            System.out.println("false");
//        }
//           long ref=ok.stream().filter((String name) -> name.length()>5).count();
//        System.out.println("enter count of greater than 5:"+ref);
//        if (ok.stream().allMatch((String name) -> name.length() == 5))
//            System.out.println("it is all match method print equal to 5 true :");
//        else
//        {
//            System.out.println("false");
//        }
//if(ok.stream().noneMatch((String obj)-> obj.length()==2))
//{
//    System.out.println("it is none match:");
//}
//else
//{
//    System.out.println("false");
//}
      //  OptionalInt ref=Arrays.stream(new int [] {3,5,6,9,8}).max();
//        System.out.println("max method:"+ref);
//        OptionalInt ref1=Arrays.stream(new int[]{6,44,12,32}).min();
//        System.out.println("min method:"+ref1);
       // Optional<String> ref2 =ok.stream().findFirst();
//        System.out.println("find-first method enter a first elements:"+ref2);
//        Optional ref3=ok.stream().findAny();
//        System.out.println("find any it is print any :"+ref3);
       // Stream.of("shubham","saurabh","akash").forEach(System.out::println);//it is use for print
//Object[] ref5=ok.stream().toArray();
//        System.out.println("first insert into and then print array :"+Arrays.toString(ref5));
//ok.stream().filter((String obj6)->obj6.length()>5).peek(obj7 -> System.out.println("enter filter:"+obj7)).forEach(System.out::println);
//=========================================================================================================================================================//
                           //***collectors***//
//        Set obj3=ok.stream().collect(Collectors.toCollection(HashSet::new));
//        System.out.println("it is printing specific list:"+obj3);
    }

}

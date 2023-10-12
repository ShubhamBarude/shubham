package jAVA8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starting_1number
{
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(10);
        obj.add(11);
        obj.add(21);
        obj.add(51);
        obj.add(111);
        obj.add(333);
        obj.add(121);
      List<Integer> ref=obj.stream().filter(number->String.valueOf(number).startsWith("1")).collect(Collectors.toList());
        System.out.println(ref);
    }
}

package pra2_program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        int sum=obj.stream().collect(Collectors.summingInt(i->i));
        System.out.println(sum);
    }



}

package Practice_Program;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElementJava8 {

    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(10);
        obj.add(14);
        obj.add(7);
        obj.add(2);
        obj.add(65);

        int sumof=obj.stream().collect(Collectors.summingInt(i->i));
        System.out.println(sumof);
    }


}
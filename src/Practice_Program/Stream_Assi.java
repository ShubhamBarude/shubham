package Practice_Program;

import java.util.ArrayList;
import java.util.List;

public class Stream_Assi
{
     public static void main(String[] args) {
    List<String> obj = new ArrayList<>();
    obj.add("shubham");
    obj.add("ram");
    obj.add("shiv");
    obj.add("veer");
    obj.add("shubham");
    String ok="veer";

    obj.stream().filter((ref->ref!=ok)).forEach(System.out::println);
    }

}

package Practice_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingList_ConvertStringToInteger
{
    public static void main(String[] args) {
        List obj=new ArrayList();
        obj.add(Integer.parseInt("2"));
       obj.add(Integer.parseInt("3"));
//obj.add("shubham");
        obj.add(1);
        obj.add(4);
        System.out.println("it is first sout"+obj);
        Collections.sort(obj);
        System.out.println(obj);
    }
}

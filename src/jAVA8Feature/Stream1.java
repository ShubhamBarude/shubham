package jAVA8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream1

{
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        List<String> list1=new ArrayList();
        list.add("alpha");
        list.add("Bike");
        list.add("cat");
        list.add("abc");
        list.add("more");
        list.add("bappa");
        list.add("advance");
        String Name="a";
        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith(Name.toLowerCase())){
                list1.add(list.get(i));
            }
        }

        System.out.println(list1);
    }


}

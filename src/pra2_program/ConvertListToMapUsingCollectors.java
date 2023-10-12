package pra2_program;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMapUsingCollectors {
    private int Id;
    private String name;

    public ConvertListToMapUsingCollectors(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<ConvertListToMapUsingCollectors> obj=new ArrayList<>();
        obj.add(new ConvertListToMapUsingCollectors(1,"shubham"));
        obj.add(new ConvertListToMapUsingCollectors(2,"akash"));
        obj.add(new ConvertListToMapUsingCollectors(3,"onkar"));
        LinkedHashMap<Integer,String> ref=obj.stream().
                collect(Collectors.
                toMap(ConvertListToMapUsingCollectors::getId,ConvertListToMapUsingCollectors::getName,
                        (x,y)->x+","+y,LinkedHashMap::new));
        ref.forEach(
                (x, y) -> System.out.println(x + "=" + y));
    }
}

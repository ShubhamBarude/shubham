package Practice_Program;

import jAVA8Feature.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Name_Value
{
    private int id;
    private String name;

    public Stream_Name_Value(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Stream_Name_Value{" +
                "id=" + id +
                ", name=" + name +
                '}';

    }

    public static void main(String[] args) {
        List<Stream_Name_Value> obj=new ArrayList<>();
        obj.add(new Stream_Name_Value(01,"visit"));
        obj.add(new Stream_Name_Value(06,"veer"));
        obj.add(new Stream_Name_Value(02,"akash"));
        obj.add(new Stream_Name_Value(03,"onkar"));
        obj.add(new Stream_Name_Value(04,"shubham"));
        Map<String,Integer> ref1=obj.stream().collect(Collectors.toMap(Stream_Name_Value::getName,((Stream_Name_Value s)->s.getName().length())));
        System.out.println(ref1);
    }
}

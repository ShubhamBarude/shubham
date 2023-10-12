package ArrayList;

import java.util.ArrayList;

public class ArrayList02
{
    public static void main(String[] args) {
        ArrayList<ArrayList01> obj1=new ArrayList<ArrayList01>();
        obj1.add(new ArrayList01(02,"akash","pune"));
        obj1.add(new ArrayList01(04,"veer","latur"));
        System.out.println(obj1);
    }
}

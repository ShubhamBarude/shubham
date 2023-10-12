package Collection;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_test
{
    public static void main(String[] args) {
        Set obj=new TreeSet();
        obj.add(80);
        obj.add(90);
        obj.add(100);
        obj.add(100);
        //obj.add(null);
        System.out.println(obj);

    }
}

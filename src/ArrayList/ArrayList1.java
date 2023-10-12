package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1
{
    public static void main(String[] args) {
        List obj=new ArrayList();
        obj.add("shubham");
        obj.add("akash");
        obj.add(10);
        System.out.println(obj);
        String s1=(String)obj.get(0);
        System.out.println("it is second:"+s1);
        String s2=(String)obj.get(1);
        System.out.println("it is second:"+s2);
        String s3=(String)obj.get(2);
        System.out.println("it is second:"+s3);




    }
}

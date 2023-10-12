package Practice_Program;

import java.util.*;

class Itr{
    public static void main (String args[]){

        List obj=new ArrayList();
        obj.add("shubham");
        obj.add(10);
        obj.add(0.23);
        Iterator ref=obj.iterator();
        while (ref.hasNext()){
            System.out.println("enetr value"+ref.next());
        }

    }





}
package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OpratorTest1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("ZTT");
        list.add("CGD");
        list.add("UYU");
        list.add("NZX");
        list.add("ABC");
        list.add("UYU");
        list.add("ABC");
        list.add("123");

        //for loop
        /*for(int i=3; i < list.size() -3; i++){

        }*/

        //foreach
        for (String s23:list) {
            // list.add("Java");
            //System.out.println(s23.concat("Test"));
        }

        //System.out.println(list);

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.hasPrevious()){
                System.out.println("It has previous element which is "+iterator.next());
            }
            iterator.add("Java added");
            System.out.println("Using List Iterator "+iterator.next());
        }

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){

        }

        // int a = 123;




    }
}

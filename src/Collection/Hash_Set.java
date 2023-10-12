package Collection;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set
{
    public static void main(String[] args) {
        Set Hash= new HashSet();

        Hash.add(20);
        Hash.add(20);
        Hash.add("shubham");
        Hash.add('s');
        Hash.add(0.23);
        Hash.add(null);
        Hash.add(null);
        System.out.println(Hash);

    }
}

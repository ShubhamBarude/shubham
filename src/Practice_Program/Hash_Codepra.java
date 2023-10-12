package Practice_Program;

import java.util.HashMap;
import java.util.Map;

public class Hash_Codepra
{
    public static void main(String[] args) {
        String s="shubham";
        String s3="School";
        Hash_Codepra obj=new Hash_Codepra();
        System.out.println("first object:"+s.hashCode());
        Hash_Codepra obj1=new Hash_Codepra();
        System.out.println("second object:"+s3.hashCode());

        String s1=new String("shubham");
        System.out.println("it is first String:"+s.hashCode());
        System.out.println("it is second String:"+s1.hashCode());

//        Map<String, String> map = new HashMap<>();
//        map.put("123", "ABCD");
//        map.put("124", "ABCD1");
//        map.put("126", "ABCD2");
//        map.put("127", "ABCD3");
//
//        map.put(null, "ABVD766756");
//       // System.out.println("ABVD766756  " +map.get(null));   //ABVD766756
//        map.put(null, "ABVD99");
//       // System.out.println("ABVD99  " + map.get(null));  //ABVD99
//        map.put(null, "ABVD66");
//       // System.out.println(map.get(null)); //
//        map.put(null, "ABVD55");
//      //  System.out.println(map.get(null));  //
//        map.put(null, "ABVD234");
//
//        System.out.println(map.get(null));  //ABVD234
//        System.out.println(map.size());     //5
   }
}

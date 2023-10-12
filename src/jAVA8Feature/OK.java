package jAVA8Feature;

import java.util.function.Predicate;

interface test07 {
    void name(String a);
}

public class OK implements test07 {
    @Override
    public void name(String a) {
        System.out.println("enter a name:" + a);
    }

    public static void main(String[] args) {
        OK obj = new OK();
        obj.name("shubham");

// anonymous
        test07 obj1 = new test07() {
            @Override
            public void name(String a) {
                System.out.println("anonymous:" + a);
            }
        };
        obj1.name("saurabh");
        // lambda expression

        test07 obj3 = (String a) -> {
            System.out.println("Lambda:" + a);

        };
        obj3.name("akash");
        
    }
}


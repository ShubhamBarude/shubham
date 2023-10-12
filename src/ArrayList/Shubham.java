 package ArrayList;

public class Shubham {
    Object arr[];
    int s;
    int capacity;

    Shubham() {
        capacity = 10;
        s = 0;
        arr = new Object[capacity];
    }

    void add(Object item) {
        arr[s++] = item;
    }
    Object get(int index){
        return arr[index];
    }
    int size(){
        return s;
    }
}
 class CustomArrayList {
    public static void main(String[] args) {
        Shubham obj =new Shubham();
        obj.add(1);
        obj.add("Shubham");
        obj.add(50);
        obj.add(65);

        for (int i=0;i<obj.size();i++){
            System.out.println(obj.get(i));
           // System.out.println(obj);
        }
        System.out.println(obj.size());
    }
}

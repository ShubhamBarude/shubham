package Practice_Program;

class Shubham {
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
public class  CustomArrayList {
    public static void main(String[] args) {
        Shubham Ak =new Shubham();
        Ak.add(1);
        Ak.add("shubham");
        Ak.add(65);
        Ak.add(23);

        for (int i=0;i<Ak.size();i++){
            System.out.println(Ak.get(i));
        }
    }
}
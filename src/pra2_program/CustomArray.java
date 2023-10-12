package pra2_program;

public class CustomArray {
    Object arr[];
    int s;
    int capacity;
    CustomArray(){
        s=0;
        capacity=3;
        arr=new Object[capacity];
    }
    void add(Object element){
        arr[s++]=element;
    }
    int size(){
        return s;
    }
    Object get(int index){
        return arr[index];
    }

    public static void main(String[] args) {
        CustomArray ref=new CustomArray();
        ref.add(78);
        ref.add("shubham");
        ref.add('a');
        for(int i=0;i<ref.size();i++){
            System.out.println("print element:"+ref.get(i));
        }
    }
}

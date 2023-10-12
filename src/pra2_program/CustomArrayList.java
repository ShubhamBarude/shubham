package pra2_program;

public class CustomArrayList {
    Object arr[];
    int s;
    int capacity;

    CustomArrayList() {
        s = 0;
        capacity = 2;
        arr = new Object[capacity];

    }

    void add(Object item) {
        arr[s++]=item;
    }
    int size(){
        return s;
    }
    Object get(int index){
        return arr[index];
    }

    public static void main(String[] args) {
        CustomArrayList obj=new CustomArrayList();
        obj.add("sai");
        obj.add(56);
        for(int i=0;i<obj.size();i++){
            System.out.println("print elements:"+obj.get(i));
        }
    }
}
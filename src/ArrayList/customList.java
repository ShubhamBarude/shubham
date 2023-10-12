package ArrayList;

public class customList {
    public static void main(String[] args) {
        custom1 obj = new custom1();
        obj.add("shubham");
        obj.add("akash");
        obj.add(10);
        for(int i=0;i< obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

}
class custom1{
    Object [] arr;
    int s;
    int capacity;
    custom1 (){
        s=0;
        capacity=3;
        arr=new Object[capacity];
    }
    void add(Object element)
    {
        arr[s++]=element;
    }
    int size()
    {
        return s;
    }
     Object get(int index){
        return arr[index];
     }
}

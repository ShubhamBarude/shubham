package Practice_Program;
class vision{
    Object arr[];
    int capacity;
    int s;
    vision(){
capacity=5;
s=0;
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
    Object get(int index_value)
    {
        return arr[index_value];
    }

}
public class CustomArrayList01 {
    public static void main(String[] args) {


        vision obj = new vision();
        obj.add("shubham");
        obj.add(10);
        obj.add('k');
        obj.add(0.23);
        obj.add(36987412564897l);
       for(int i=0;i<obj.size();i++)
       {
           System.out.println(obj.get(i));
       }
    }
}
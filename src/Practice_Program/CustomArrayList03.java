package Practice_Program;
class Akash{

    Object arr[];
    int s;
    int capacity;
    Akash() {
        capacity = 10;
        s = 0;
        arr = new Object[capacity];
    }
        void add(Object element){
        arr[s++]=element;
    }
    Object get(int index)
    {
        return  arr[index];
    }
    int size()
    {
        return s;
    }
}
public class CustomArrayList03
{
    public static void main(String[] args) {
        Akash obj=new Akash();
        obj.add("shubham");
        obj.add("akash");
        obj.add(10);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println("jegvhgfkij:"+obj.get(i));
        }
    }

}

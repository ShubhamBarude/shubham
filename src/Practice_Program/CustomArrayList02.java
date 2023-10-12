package Practice_Program;
class Shubham01
{
    Object arr[];
    int s;
    int Capacity;
    Shubham01(){
        Capacity=20;
        s=0;
        arr=new Object[Capacity];
    }
    void add(Object element)
    {
        arr[s++]=element;
    }
    int size()
    {
        return s;
    }
    Object get(int index)
    {
        return arr[index];
    }
}
public class CustomArrayList02
{
    public static void main(String[] args) {
        Shubham01 obj=new Shubham01();
        obj.add("shubham");
        obj.add("akash");
        obj.add("veer");
        obj.add(65);
        obj.add(10);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println("enter a element:"+obj.get(i));
        }
    }
}

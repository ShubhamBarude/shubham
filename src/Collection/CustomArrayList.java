package Collection;
class tdit
{
    Object arr[];
    int s;
    int capacity;
    tdit() {
        capacity = 10;
        s = 0;
        arr = new Object[capacity];
    }
        void add(Object element){
            arr[s++]=element;
        }
        Object get(int index)
        {
            return arr[index];
        }
        int size()
        {
            return  s;
        }
    }

public class CustomArrayList
{
    public static void main(String[] args) {
        tdit dp=new tdit();
                dp.add("akash");
                dp.add("shubham");
                dp.add("vision");
                for(int i=0;i<dp.size();i++)
                {
                    System.out.println("print element:"+dp.get(i));
                }
    }

}

package Practice_Program;
class deepak{
    Object arr[];
    int s;
    int capacity;
    deepak(){
        s=0;
        capacity=4;
        arr=new Object[capacity];
    }
    void add(Object item)
    {
        arr[s++]=item;
    }
    Object get(int index){
        return arr[index];
    }
    int size (){
        return s;
    }
}
public class CustomArrayAddMethod
{
    public static void main(String[] args) {
        deepak ok=new deepak();
        ok.add(22);
        ok.add(14);
        ok.add("akash");
        ok.add("saurabh");
        for (int i=0;i< ok.size();i++)
        {
            System.out.println("it is message for printing for getting:"+ok.get(i));
        }
    }

}

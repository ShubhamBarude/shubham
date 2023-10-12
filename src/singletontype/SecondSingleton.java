package singletontype;

//  1)non-lazy initialization thread safe type
public class SecondSingleton
{

    private static SecondSingleton Instance=new SecondSingleton();
    public static SecondSingleton Instance(){
        System.out.println("it is first method:");

        return Instance;
    }
    private SecondSingleton(){

    }
    public void ak(){
        System.out.println("it is second method:");
    }
    public static void main(String[] args) {
        SecondSingleton ref= SecondSingleton.Instance();
        ref.ak();
        System.out.println(ref.hashCode());
        System.out.println(Instance.hashCode());
    }
}

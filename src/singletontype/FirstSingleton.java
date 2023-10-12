package singletontype;
//  1) lazy initialization non-thread safe type
public class FirstSingleton
{

    private static FirstSingleton Instance=null;
    public static FirstSingleton Instance(){

        if(Instance==null){
            Instance=new FirstSingleton();
            System.out.println("gfderv");
        }
        return Instance;
    }
    private FirstSingleton(){


    }

    public static void main(String[] args) {
        FirstSingleton ref= FirstSingleton.Instance();
    }
}

package encapsulation;

public class New_assignment
{
    void see()
    {
        System.out.println("it is parent class method 1:");
    }
}
class New_assignment01 extends New_assignment
{
    void see() {

        System.out.println("it is child class method 2:");
    }
        void saw(){
            System.out.println("it is child class 3:");
        }

    public static void main(String[] args) {
        New_assignment obj=new New_assignment();
        obj.see();
        New_assignment obj1=new New_assignment01();
        obj1.see();
       // obj.saw();
    }
}


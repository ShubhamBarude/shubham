package Practice_Program;
// it is shallow copy
class makad {
    String sub;
    String sub1;

    public makad(String sub, String sub1) {
        this.sub = sub;
        this.sub1 = sub1;
    }
}
public class ShallowCopy implements Cloneable {
    int x, y;
    makad mk;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ShallowCopy(int x, int y,makad mk) {
        this.x = x;
        this.y = y;
        this.mk=mk;
    }

    public void display() {
        //System.out.println("it is printing value of x="+x+" $$$ it is printing value of y="+y);
    }

}
class dukkar{

    public static void main(String[] args) throws CloneNotSupportedException {
        makad obj=new makad("hindi","marathi");
//        obj.x=10;
//        obj.y=20;
        ShallowCopy obj1=new ShallowCopy(10,20,obj);
        ShallowCopy obj2=null;
        try{
           obj2=(ShallowCopy)obj1.clone();
        }
        catch (CloneNotSupportedException e){


            e.printStackTrace();
        }
        System.out.println(obj1.mk.sub1);
        obj1.mk.sub1="sanskrit";
        System.out.println(obj1.mk.sub1);
//        obj1.x=65;
//        obj1.y=30;
  //      obj1.x=22;
//        obj.display();
//        obj1.display();
    }
}

package Practice_Program;
//it is deep copy
public class DeepCopy {
    int x,y;
    public void display(){
        System.out.println("it is printing value of x="+x+" $$$ it is printing value of y="+y);
    }

    public static void main(String[] args) {
        DeepCopy obj=new DeepCopy();
        obj.x=10;
        obj.y=25;
        obj.display();
        DeepCopy obj1=new DeepCopy();
        obj1.x=65;
        obj1.y=30;
        obj1.x=obj.x;
        obj1.y=obj.y;
        obj1.display();

    }
}

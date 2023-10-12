package Practice_Program;


public class ObjectCloning implements Cloneable {
    int x,y;
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public void display(){
        System.out.println("it is printing value of x="+x+" $$$ it is printing value of y="+y);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloning obj=new ObjectCloning();
        obj.x=10;
        obj.y=20;
        ObjectCloning obj1=(ObjectCloning)obj.clone();
        obj.display();
        obj1.display();
    }
}

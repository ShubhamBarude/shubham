package control_statement;

public class imutableclass2
{
    public static void main(String[] args) {
        imutable2 obj =new imutable2("college of engineering ambajogai");
        obj.getCollage_name();
    }

}

final class  imutable2
{
    private final String collage_name;
    imutable2(String collage_name)
    {
        this.collage_name=collage_name;
        System.out.println("enter a constructor:"+collage_name);
    }

    public String getCollage_name() {
        System.out.println("it getter method");
        return collage_name;
    }

}

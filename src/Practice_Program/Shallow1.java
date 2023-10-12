package Practice_Program;



public class Shallow1 implements Cloneable
{
    private String name;
    private int id;

    public Shallow1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "copy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Shallow1(Shallow1 other) {
        this.name = other.name;
        this.id = other.id;
    }

    public static void main(String[] args)
    {
        Shallow1 cp = new Shallow1("akash",45);
        Shallow1 c1 =new Shallow1(cp);
        System.out.println("second object="+c1.name);
        System.out.println("it is first object="+cp.name);
        System.out.println(c1);
    }
}

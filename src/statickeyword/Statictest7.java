package statickeyword;

public class Statictest7 {
    static int b = 30;
    static int a = 10;
    int d=20;
    String name = "shubham";
    String city = "pune";
    static void show()
    {
        System.out.println(" static method :"+a);
    }

    Statictest7() {
        System.out.println("constructor:" + (city));
    }

    void add() {
        System.out.println("instance initilization block:" + (a + b));
    }

    static {
        System.out.println("static intitilization block:" + (b - a));
    }

    public static void main(String[] args) {
        Statictest7 obj = new Statictest7();
        obj.add();
        Statictest7.show();
    }
}


abstract class Flowers {

    abstract void Rose(String Rose1, String Rose2);

    void Lilly(String Colour) {
        System.out.println("Lilly: " + Colour);

    }
}

class Flowers2 extends Flowers {

    void Rose(String Rose1, String Rose2) {
        System.out.println("Rose: " + Rose1 + " " + Rose2);

    }
}

abstract class Flowers3 extends Flowers {

    void Gerbera(int red, int blue) {

        System.out.println("Gerbera " + red + " " + blue);
    }

}

class Flowers4 extends Flowers3 {

    @Override
    void Rose(String Rose1, String Rose2) {

    }
}

public class Abstract11 {
    public static void main(String[] args) {
        Flowers2 ff = new Flowers2();
        ff.Rose("Yellow Rose", "Red Rose");
        ff.Lilly("White Lilly");
        Flowers4 ll = new Flowers4();
        ll.Gerbera(1, 2);

    }

}
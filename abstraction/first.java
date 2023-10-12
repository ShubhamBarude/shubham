
abstract class First {
    abstract void one();

}
class Second extends First {

    @Override
    void one() {
        System.out.println("This is first class method");
    }

    void two(){

        System.out.println("This is second class method");
    }
}

abstract class Third extends Second{
    void three(){

        System.out.println("This is third class method");
    }
}

abstract class Forth extends Third{

    void forth(){
        System.out.println("This is forth class method");
    }
}

abstract class Fifth extends Third {
    void five() {
        System.out.println("This is fifth class method");
    }

}

class sixth extends Forth{

}

public class MainClass extends Fifth {
    public void ak() {


    }

}
    public static void main(String[] args) {

        MainClass ref = new MainClass();
        ref.one();
        ref.two();
        ref.three();
        ref.five();
        sixth ref2=new sixth();
        ref2.forth();

    }
}

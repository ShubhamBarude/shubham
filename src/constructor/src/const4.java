public class const4 {
    const4() {
        System.out.println("enetr a default 3A");
    }

    const4(String a) {
        this();
        System.out.println("enter a method 3B");
    }

    const4(int s, short f) {
        this("shubham");
        System.out.println("enter a method 3C");
    }

    const4(int a, long b, short c) {
        this(20, (short) 52);
        System.out.println("enetr a method 3D");
    }

    const4(float a) {
        this(54, 259874l, (short) 98);
        System.out.println("enetr a method 3E");
    }
}

class const04 extends const4 {
    const04() {
        super(0.14f);
        System.out.println("enter a method 4A");
    }

    const04(byte x, String s, char l) {
        this();
        System.out.println("enetr a method 4B");
    }

    const04(int a, byte v) {
        this((byte) 45, "pune", 'h');
        System.out.println("enetr a method 4C");
    }

    const04(long k) {
        this(30, (byte) 47);
        System.out.println("enetr a method 4D");
    }
}

class const004 extends const04 {
    const004() {
        super(88795648l);
        System.out.println("enetr a method 5A");
    }

    const004(String name) {
        this();
        System.out.println("enetr a method 5B");
    }

    const004(int a, byte b) {
        this("latur");
        System.out.println("enetr a method 5C");
    }

    const004(long a, String k, int n) {
        this(62, (byte) 14);
        System.out.println("enetr a method 5D");
    }

    public static void main(String[] args) {
        const004 obj = new const004();
    }
}

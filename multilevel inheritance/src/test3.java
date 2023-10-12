public class test3 {
    String a = "akash";
    char b = 's';
    int c = 30;
    long d = 8947;

    public int ak() {
        System.out.println("enter a value string");
        return 10;
    }
}

    class test03 extends test3 {
        public void bk() {
            System.out.println("enter a String value" + a);

        }


    }

    class test003 extends test03 {
        public void ck() {
            System.out.println("enter a char" + b);

        }
    }

    class test0003 extends test003 {
        public void dk() {
            System.out.println("enter a value int" + c);
        }
    }

    class test00003 extends test0003 {

        public void ek() {
            System.out.println("enter a value" + d);
        }

        public static void main(String args[]) {
            test00003 zk = new test00003();
            zk.ak();
            zk.bk();
            zk.ck();
            zk.dk();
            zk.ek();
        }
    }


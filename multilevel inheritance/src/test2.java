public class test2 {
    String a = "red";
    char b = 's';
    boolean c = true;
    long d = 56987;

    public void ak() {
        System.out.println("enter a string value" + a);
    }
}
    class test02 extends test2 {
        public void bk() {
            System.out.println("enter a char value" + b);
        }
    }
        class test002 extends test02 {
            public void ck() {
                System.out.println("enter a boolean value " + c);
            }
        }
            class test0002 extends  test002 {
                public void dk() {
                    System.out.println("enter a long value " + d);
                }
                public static void main(String args[])
                {
                    test0002 zk=new test0002();
                    zk.ak();
                    zk.bk();
                    zk.ck();
                    zk.dk();

                }
            }




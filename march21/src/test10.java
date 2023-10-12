public class test10 {
    public int bnm(int a,String b) {
        System.out.println("enter a value:" + a+" " + b);
        return 0;
    }
    public int abc(float z,boolean y)
    {
        System.out.println("enter value:"+z+ " "+y);
        return 23;
    }
        public static void main(String args[])
        {
            test10 op=new test10();

            op.bnm( 10,"shubham");
            op.abc( 0.21f,true);
        }


    }


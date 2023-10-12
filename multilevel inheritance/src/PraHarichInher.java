public class PraHarichInher {
    int a = 20;
    int b = 40;
    int c = 10;

    String add() {
        int result = b + a;
        System.out.println("enter a addition:" + result);
        return "string";
    }

}
class PraHarichInher1 extends PraHarichInher
{
    int sub()
    {
        int result1=b-c;
        System.out.println("enter a sub:"+result1);
        return 10;
    }
}
class PraHarichInher2 extends PraHarichInher {
    int mul() {
        int result2 = b * c;
        System.out.println("enter a mul:" + result2);
        return 30;
    }
}
    class PraHarichInher3 extends PraHarichInher {
        int div() {
            int result3 = b / a;
            System.out.println("enetr a div:" + result3);
            return 54;
        }

        public static void main(String[] args) {
            PraHarichInher3 obj=new PraHarichInher3();
            PraHarichInher2 obj1=new PraHarichInher2();
            PraHarichInher1 obj2=new PraHarichInher1();
            obj2.sub();
            obj1.mul();
            obj.add();
            obj.div();

        }
    }





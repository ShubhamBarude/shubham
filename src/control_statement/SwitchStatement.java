package control_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        int num=5;
        switch (num){
            case 1:
                System.out.println("mon");
                 break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("not present :");
        }
    }
}

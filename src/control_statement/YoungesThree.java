package control_statement;

public class YoungesThree
{
    public static void main(String[] args) {
        int shyam_age=30;
        int ram_age=20;
        int ajay_age =10;
        if(shyam_age>ram_age ||  shyam_age>ajay_age)
        {
            System.out.println("shyam is youngest");
        }
        else if(ram_age>shyam_age ||  ram_age>ajay_age)
        {
            System.out.println("ram is youngest");
        }
        else {
            System.out.println("ajay is youngest");
        }

    }

}

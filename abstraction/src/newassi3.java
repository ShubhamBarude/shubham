public class newassi3
{
    public boolean ak(char a,char b)
    {
        System.out.println("enetr a first method "+a+" "+b);
        return true;
    }
    public int bk(String a,String b)
    {
        System.out.println("enetr a second method:"+a+" "+b);
        return 10;
    }
    public String ck(long mob_no,long pincode)
    {
        System.out.println("enetr a third method"+mob_no+" "+pincode);
        return "shubham";
    }

    public static void main(String[] args) {
        newassi3 obj=new newassi3();
        newassi3 obj1=new newassi3();
        newassi3 obj2=new newassi3();
        obj.ak('d','b');
        obj.bk("shubham","pune");
        obj.ck(9325180505l,413512);
        obj1.ak('a','v');
        obj1.bk("akash","lentra");
        obj1.ck(8380858982l,4136512);
        obj2.ak('l','k');
        obj2.bk("beed","ambajogai");
        obj2.ck(5648468644487l,846648465);

    }
}

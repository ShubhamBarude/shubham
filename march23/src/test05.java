public class test05 {
    String fd;
    float cd;
    public int lp(int a)
    {
        int sp=63;
        System.out.println("eneter:"+a);
        return 69;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }
    public static void main(String args[])
    {
        test05 pl=new test05();
        pl.setCd(0.23f);
        pl.setFd("shb");
        System.out.println(pl.getCd());
        System.out.println(pl.getFd());

    }
}

package Practice_Program;



class Ssp{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String N){
        this.name=N;
    }


    public static void main(String []args){
        Ssp obj = new Ssp();
        obj.setName("Saurabh S Patil");
        System.out.println("Print the name "+obj.getName());

    }
}
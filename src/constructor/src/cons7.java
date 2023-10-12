public class cons7
{


        private String first_name;
        private String last_name;
        private String mid_name;
        private int id;
        private double salary;


    public cons7(String first_name, String last_name, String mid_name, int id, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.mid_name = mid_name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "cons7{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", mid_name='" + mid_name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        cons7 obj=new cons7("shubham","barude","ramesh",20,5214.33265);
        System.out.println("enter a values:"+obj.toString());
    }

}

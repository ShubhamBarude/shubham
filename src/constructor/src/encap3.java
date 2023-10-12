public class encap3 {
    private String first_name;
    private String last_name;
    private String mid_name;
    private String address;
    private int emp_id;
    private double salary;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMid_name() {
        return mid_name;
    }

    public void setMid_name(String mid_name) {
        this.mid_name = mid_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        encap3 obj=new encap3();
        encap3 obj1=new encap3();

        obj.setFirst_name("shubham");
        obj.setLast_name("barude");
        obj.setMid_name("ramesh");
        obj.setAddress("latur");
        obj.setEmp_id(25);
        obj.setSalary(15487.23645);


        obj1.setFirst_name("angad");
        obj1.setLast_name("vaidya");
        obj1.setMid_name("limbaji");
        obj1.setAddress("nanded");
        obj1.setEmp_id(30);
        obj1.setSalary(487.236);



        System.out.println("enetr 1 data "+obj.getFirst_name());
        System.out.println("enetr 2 data "+obj.getLast_name());
        System.out.println("enetr 3 data "+obj.getMid_name());
        System.out.println("enetr 4 data "+obj.getAddress());
        System.out.println("enetr 5 data "+obj.getEmp_id());
        System.out.println("enetr 6 data "+obj.getSalary());
    //}

        System.out.println("enetr 1 data "+obj1.getFirst_name());
        System.out.println("enetr 2 data "+obj1.getLast_name());
        System.out.println("enetr 3 data "+obj1.getMid_name());
        System.out.println("enetr 4 data "+obj1.getAddress());
        System.out.println("enetr 5 data "+obj1.getEmp_id());
        System.out.println("enetr 6 data "+obj1.getSalary());
    }
}

public class encap4 {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        encap4 obj=new encap4();
        obj.setCity("pune");
        obj.setName("shubham");
        System.out.println("enetr a city:"+obj.getCity());
        System.out.println("enetr a name:"+obj.getName());
    }
}
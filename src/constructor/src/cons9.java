public class cons9
    {
        private int id;
        private String name;
        private double salary;

        public cons9(int id, String name, double salary, String city) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.city = city;
        }

        private String city;

        @Override
        public String toString() {
            return "cons9{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    ", city='" + city + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            cons9 obj=new cons9(10,"shubham",54.014,"ltr");
            System.out.println("enetr a value:"+obj.toString());
        }


    }


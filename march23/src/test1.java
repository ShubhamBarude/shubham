 class VariableTypes {
    // Object // instance
    //instance variable
    //each object will get separate copy of instance variable
    public int  id;
    public String lName;
    public String mName;


    //static or non instance variable
    //whatever static that belongs to whole class
    private static String collegeName;


    void test(){
        //local variable
        int age = 20;
        System.out.println(age);
        System.out.println(id);
        System.out.println(collegeName);

    }

    public int getfName() {
        return 10;
    }

    public void setfName(String fName) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    //public static String getCollegeName() {
      //  return collegeName;
    //}

   // public static void setCollegeName(String collegeName) {
       // VariableTypes.collegeName = collegeName;
   // }

    public static void main(String[] args) {

        VariableTypes vt = new VariableTypes();
        vt.setfName("fname1");
        vt.setlName("lname1");
        vt.setmName("mname1");
        // VariableTypes.collegeName = "Test";

        //System.out.println(vt.getfName()); //fname1


        VariableTypes vt1 = new VariableTypes();
        vt1.setfName("fname");
        vt1.setlName("lname2");
        vt1.setmName("mname2");
        //VariableTypes.collegeName = "Test123";
        System.out.println(vt.getfName()); //fname1
        System.out.println(vt1.getfName()); //fname2
        //System.out.println(collegeName);

        //System.out.println(vt1.fName); //Dummyvalue    fname2

        //vt.test();
        //System.out.println(vt.fName);
        //Object Instance
    }

}

interface interfa8
{
   void ak();
   static void add()
   {
       System.out.println("static method:");
   }
   default void sub()
   {

   }
}
class interfa08 implements interfa8
{
    @Override
    public void ak() {
        System.out.println("it is normal method:");

    }

    public static void main(String[] args) {
        interfa08 obj=new interfa08();
        obj.ak();
        interfa8.add();
    }

}

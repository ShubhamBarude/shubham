package String;

public class StringMethod06 {
    static void reverse()
    {
        String name="java";
        String reverse="";

        for(int i=0; i<name.length();i++)
        {

         char ch=name.charAt(i);
          reverse=ch+reverse;
        }
        System.out.println(reverse);
   }

        public static void main(String[] args)
        {
            java obj=new java();


            reverse();
        }

     }





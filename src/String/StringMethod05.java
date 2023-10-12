package String;





    public class StringMethod05
    {
        void reverse()
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
        //
        public static void main(String[] args) {
            StringMethod04 obj=new StringMethod04();
            obj.reverse();
        }
    }



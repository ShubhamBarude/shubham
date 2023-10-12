package String;

public class StringMethod
{
    public static void main(String[] args) {
        String name="shubham";
        String name1="     saurab pr";
        String name2="akash";
        String s1="what is your name";
        System.out.println("enter a length:"+name.length());//7
        System.out.println("enter char:"+name.charAt(4));//h
        System.out.println("enter substring second:"+name2.substring(1,4));
        System.out.println("substring :"+name.substring(3));//bham
        System.out.println("substring with i , j-1=: "+name.substring(2,5));//ubh
        System.out.println("concate string:"+name2.concat(name1));//akashsaurab
        System.out.println("index of :"+s1.indexOf("your"));// starting point output:8
        System.out.println("last index of:"+s1.lastIndexOf("m"));//15
        System.out.println("trim ="+name1.trim());
        System.out.println("replace:"+name2.replace("a","y"));

    }
}

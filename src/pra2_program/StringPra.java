package pra2_program;

public class StringPra {//def; string is sequence of character
    public static void main(String[] args) {
        //we can create object by two ways
        String ref=new String("shubham");//1)  by using new keyword
        String ref1=new String ("akash");//a) it is store in heap memory
        String ref3=new String("shubham12");
        String obj="shubham12";//2) by using literal
        String obj1="akash12";//a)  it is store in string constant pool (scp)
        String obj2="shubham12";
        //diff bet two is
        //by using new keyword creating object every time it will create new object ex:
        String ref4=new String("shubham");//same object is in heap memory,but it will create new object
        //but by using literal we are consume memory because before creating object it is checking same object is already exit
        // it is already exit, so it will not create new object

        System.out.println("it is print ref:"+ref);
        System.out.println("it is print ref1:"+ref1);
        ref=ref.concat("Tdit");//String is immutable it means unchangeable and unmodifiable
        //so by using concat we can create new related object, but we can cant change original object
        System.out.println("it is print concat String:"+ref);
        System.out.println("it is print obj:"+obj);
        System.out.println("it is print obj1:"+obj1);
        System.out.println("it is used for the check memory location and also check contains:"+(ref==ref1));//false
        System.out.println("it is for the location and contains of string is same:"+(ref==ref4));
        //output is false because always create new object bcz we are using new keyword in both object
        System.out.println("it is for == operator will give output true:"+(obj==obj2));
        //because in this case location and contains same
        System.out.println("it is for equals method there is not checking memory location :"+(ref3.equals(obj)));//true
        //it is checking only String contains
        System.out.println("it is for equals method:"+(obj.equals(obj2)));//true
        System.out.println("it is last statements : "+ref4.equals(ref));//false,bcz of new keywords
        //==========================================================================================================//
//1)string def
// 2) type of String object
// 3) difference b/w two object and what is meaning of both object
//4)== operator and equals method and diff b/w , what is use of them


    }
}

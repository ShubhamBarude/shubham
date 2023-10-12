package jAVA8Feature;
interface shubham{
    void add(String a);
}
public class StreamPraCode implements shubham {
    @Override
    public void add(String a) {
        System.out.println("it is first method:"+a);
    }

    public static void main(String[] args) {
        StreamPraCode ok=new StreamPraCode();
        ok.add("akash");
        //Annonyms class
        shubham ok1=new shubham() {

            @Override
            public void add(String a) {
                System.out.println("it is second method:"+a);
            }
        };
        ok1.add("mahesh");

        //Lambda Expression
        shubham ok2=(String a)->{
            System.out.println("it is third method:"+a);
        };
        ok2.add("dipak");
    }
}

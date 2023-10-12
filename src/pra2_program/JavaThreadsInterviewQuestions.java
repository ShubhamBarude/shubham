package pra2_program;

public class JavaThreadsInterviewQuestions {

    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();

        System.out.println(t.getPriority());       //Output : 5

        t.setPriority(8);

        System.out.println(t.getPriority());      //Output : 8
    }

}

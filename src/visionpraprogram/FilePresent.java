package visionpraprogram;

import java.io.File;
import java.io.IOException;

public class FilePresent
{

    public static void main(String[] args) throws IOException {
        File path=new File("C:\\feb_code");
String alllist[]= path.list();
        System.out.println("print all list:");
        for(int i=0;i<alllist.length;i++)
        {
            System.out.println("print list:"+alllist[i]);
        }
    }
}

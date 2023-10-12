package visionpraprogram;

import java.io.FileWriter;
import java.util.Scanner;

public class CSVFiles
{
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("test.csv");
            System.out.println();
   try{
      obj.write("this is csv file:");
       obj.write("print first message:");
       obj.write("print second message:");
   }
   finally {
       obj.close();
   }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

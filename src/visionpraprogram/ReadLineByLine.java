package visionpraprogram;

import java.io.File;
import java.util.Scanner;

public class ReadLineByLine
{
    public static void main(String[] args) {
        try {
            File obj = new File("show.txt");

            Scanner sc = new Scanner(obj);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

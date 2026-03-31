package U1P1;

import java.io.*;
import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        int wordcount = 0;
        try{
            File file = new File("input.txt");
            Scanner input = new Scanner(file);

            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] words = line.split(" ");
                wordcount += words.length;
            }


        }catch(Exception e){
            System.out.println("An error occurred:  " + e.getMessage());
        }

        System.out.println("Number of Words in file: " + wordcount);
    }
}

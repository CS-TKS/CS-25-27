package U1P1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class HighScore {

    public static void main(String[] args){

        try{
            File file = new File("data.txt");
            Scanner sc = new Scanner(file);
            FileWriter out = new FileWriter("highScore.txt",true);

            int sum = 0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] words = line.split(",");
                System.out.println(words[1]);
                int myNum = Integer.parseInt(words[1]);
                if(myNum > 89){
                    sum = sum + myNum;
                    out.append(line);
                    out.append("\n");
                }
                System.out.println(sum);
            }
            out.close();

        }catch(Exception e){
            System.out.println("An error occurred:  " + e.getMessage());
        }

    }
}

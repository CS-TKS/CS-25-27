package U1P1;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class FileProcessingScaffold {
    static String fileName = "text.txt";

    public static void main(String[] args) {

        System.out.println("#######################");
        System.out.println("File Processing Demo");
        System.out.println("#######################");
        System.out.println();

        //writeNewFile();
        readWithScanner();

    }

    public static void writeNewFile(){
try {
    System.out.println("Writing new file......");
    System.out.println();

    FileWriter writer = new FileWriter(fileName);

    writer.write("File Processing");
    writer.write("\n");
    writer.write("Lorem Ipsum is simply dummy text.");


    writer.close();
}catch(IOException e){
    System.out.println("An error occurred:  " + e.getMessage());
}
    }

    public static void readWithScanner(){
        System.out.println("Reading with Scanner...");
        try{
            File myFile = new File(fileName);

            Scanner fileScanner = new Scanner(myFile);

            while(fileScanner.hasNextLine()){
                String data = fileScanner.nextLine();
                System.out.println("Reading Line: " + data);
            }

            fileScanner.close();


        }catch(Exception e){
            System.out.println("File not found or unreadable.");
        }
    }

}


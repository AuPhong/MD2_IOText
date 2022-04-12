package test;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        try {
            File file = new File("folder/text.txt");

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("abc");
            writer.write("\ndef");
            writer.close();

            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            reader.close();

        }catch (IOException e){
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}

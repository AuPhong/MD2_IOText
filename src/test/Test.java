package test;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try{
            File file1 = new File("number.txt");
            File file2 = new File("string.txt");
            File file3 = new File("demo.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file3));
            Scanner sc = new Scanner(reader);
            Scanner sc2 = new Scanner(reader2);
            while (sc.hasNextLine()&&sc2.hasNextLine()){
                writer.write(sc.nextLine());
                writer.write(sc2.nextLine());
                writer.write("\n");
            }
//            while (sc2.hasNextLine()){
//                writer.write(sc2.nextLine());
//            }
            writer.close();

        }catch(IOException e){
            System.out.println("Something went wrong");
        }
    }



}

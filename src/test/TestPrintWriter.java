package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) {
        float a = 1f;
        float b = 2f;
        String c = "Superman";
        char[] d = {'a','b','c','d','e','f'};

        try{
            File file = new File("folder/text2");
            PrintWriter writer = new PrintWriter(file);
            writer.println("This is content of text file.");
            writer.print(a+" ");
            writer.print(b+" ");
            writer.println(c);
            writer.println(d);
            writer.printf("This is number a: %f, this is number b: %f",a,b);
            writer.println(d);
            writer.close();
            //file.delete();

            File file1 = new File("text1.txt");
            //file1.delete();
            //file1.mkdir();
            File dir = new File("folder");
            if (dir.isDirectory()){
                String[] dirContents = dir.list();
                for (String content:dirContents) {
                    System.out.println(content);
                }
            }
            System.out.println(dir.getAbsolutePath());


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

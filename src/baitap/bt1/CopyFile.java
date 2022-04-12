package baitap.bt1;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(String sourceFile, String targetFile){
        try{
            File source = new File(sourceFile);
            if (!source.exists()){
                throw new FileNotFoundException("File is not exist.");
            }
            File target = new File(targetFile);
            if (target.exists()){
                throw new FileNotFoundException("File is already exist");
            }
            BufferedReader reader = new BufferedReader(new FileReader(source));
            BufferedWriter writer = new BufferedWriter(new FileWriter(target));
            char[] chars;
            String line = null;
            int count = 0;
//            while((line=reader.read())!=null){
//                writer.write(line);
//                count++;
//            }
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()){
                writer.write(sc.next());
                count++;
            }
            reader.close();
            writer.close();
            System.out.println("Number of characters: "+count);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        copyFile("source.txt","target.txt");
    }
}

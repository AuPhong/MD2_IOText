package ThucHanh.ReadFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
//            String line = null;
//            int sum = 0;
//            while ((line = reader.readLine())!=null){
//                sum += Integer.parseInt(line);
//            }

            int sum = 0;
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()){
                sum += Integer.parseInt(sc.nextLine());
            }
            reader.close();
            System.out.println("Sum is "+sum);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input filepath");
        String filepath = sc.nextLine();
        readFileText(filepath);
    }
}

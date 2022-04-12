package baitap.bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("country.csv"));
            Scanner sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                printCountry(changeForm(sc.nextLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static List<String> changeForm(String line) {
        List<String> arrayList = new ArrayList<>();
        String[] country = line.split(",");
        for (int i = 0; i < country.length; i++) {
            arrayList.add(country[i]);
        }
        return arrayList;
    }

    public static void printCountry(List<String> country) {
        System.out.println("id " + country.get(0) + " code= " + country.get(1) + " name= " + country.get(2));
    }
}

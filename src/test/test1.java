package test;

public class test1 {
    public static void main(String[] args) {
        String obj = "abcdef";
        int length = obj.length();
        char[] c = new char[length];
        obj.getChars(0, length, c,0);
        for (char element:c) {
            System.out.println(element);
        }
    }
}

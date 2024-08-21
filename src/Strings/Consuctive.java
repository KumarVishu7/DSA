package Strings;


public class Consuctive {
    public static void main(String[] args) {
        String str="leeeeetcode";
        int data=maxPower(str);
        System.out.println(data);
    }
    public static int maxPower(String str) {
        int n = str.length();
        int count = 0;

        // Traverse string except last character
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) count++;
        }
        return count;
    }
}

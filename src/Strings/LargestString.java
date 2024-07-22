package Strings;

public class LargestString {
    public static void main(String[] args) {
        String str="Apple";
        String str2="apple"; // if output =0, then string are same and if output is negative=-1 then not matched
       // System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));// es method me capital and small letter treat as same
    }
}

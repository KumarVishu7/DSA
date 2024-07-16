package Strings;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        String str="AYEAJ TOMAR YADAUV";
       vowels(str);


    }
    public static void vowels(String str){
        char ch[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E' || str.charAt(i)=='I'||str.charAt(i)=='O'|| str.charAt(i)=='U'){
                ch[i]=str.charAt(i);
                System.out.println(ch[i]);
            }
        }
    }
}

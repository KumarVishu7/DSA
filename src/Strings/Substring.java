package Strings;

public class Substring {
    public static void main(String[] args) {
        String str="Vishu Saroha";
       // System.out.println(sub(str,0,7));

        // but in java have already substring builtin function
        for(int i=0;i<str.length();i++){
            System.out.println(str.substring(0,1));

        }
    }
    /*public static String sub(String str,int si,int ei){// si and ei are-->starting and ending index
        String substring="";
        for(int i=si;i<ei;i++){
            substring=substring+str.charAt(i);
        }
        return substring;
    }*/

}

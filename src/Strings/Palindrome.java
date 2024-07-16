package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="racecar";
      //  String b=palin(str);
       // System.out.println(b);


        // palindrome number
        int n=1234321;
        int data=palin(n);
        if(data==n) System.out.println("yes");
        else System.out.println("no");

    }
    public static String palin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return "not palindrome";
            }
            i++;
            j--;
        }
        return "palindrome";
    }
    public static int palin(int n){
        int x=0;
        while(n>0){
            int digit=n%10;
            x=(x*10)+digit;
            n=n/10;
        }
        return x;
    }
}

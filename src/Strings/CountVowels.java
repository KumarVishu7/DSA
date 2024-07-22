package Strings;

public class CountVowels {
    public static void main(String[] args) {
        String str="Ajay kumar singh";
        int value=vowels(str);
        System.out.println(value);
    }
    public static int vowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)==true){
                if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' ||ch=='u') count ++;
            }
        }
        return count;
    }
}

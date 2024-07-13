package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // check for numbers
        int numbers[]={2,4,6,8,10,12,14,16};
        /*int x=sc.nextInt();
        int index=Intsearch(numbers,x);
        if(index==-1){
            System.out.println("Not found");
        }else System.out.println(index);*/

        //check for strings
        String fruits[]={"Orange","Mango","Apple","Banana"};
        String str=sc.nextLine();
        int data=StringSearch(fruits,str);
        System.out.println(data);

    }
    public static int Intsearch(int numbers[],int x) {
        int data = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return data;
    }

    public static int StringSearch(String fruits[],String str){
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(str)){
                return i;
            }
        }
        return -1;
    }
}

package Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();
         int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage of this array is "+percentage+"%");
        System.out.println(marks.length);
    }
}

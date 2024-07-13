package Arrays;

import java.util.Scanner;

public class PassingArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        pass(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
    public static void pass(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
}

package Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int space = N-1;
        int row = 1;
        int elements=1;
        while(row<=N){
            int i = 1;
            int num=row;
            while(i<=space){
                System.out.print(" \t");
                i++;
            }

            int j = 1;
            while(j<=elements){
                System.out.print(num+"\t");
                if(row<=j){
                    num--;
                }else{
                    num++;
                }
                j++;
            }
            elements+=2;
            space--;
            row++;
            System.out.println();

        }
    }
}

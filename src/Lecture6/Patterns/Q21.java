package Lecture6.Patterns;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int star = 1;
        int space = ((2*n)-3);
        int row =1;

        while(row<= n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int k = 1;
            if(row==n){
                k=2;
            }
            while(k<=star){
                System.out.printf("* ");
                k++;
            }

            System.out.println();
            row++;
            space-=2;
            star++;
        }
    }
}

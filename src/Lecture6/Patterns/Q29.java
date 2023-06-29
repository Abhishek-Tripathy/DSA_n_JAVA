package Lecture6.Patterns;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int space = n - 1;
        int row = 1;

        while (row <= n) {
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j<=star){
                if(star==j || j==1){
                    System.out.print(row+" ");
                }else {
                    System.out.print(0 + " ");
                }
                j++;
            }

            System.out.println();
            space--;
            star+=2;
            row++;

        }
    }
}


package Lecture6.Patterns;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n;
        int space = -1;
        int row = 1;

        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            int k = 1;
            if(row==1){
                k=2;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }
            space += 2;
            star --;
            row++;
            System.out.println();

        }
    }
}

package Lecture7;

import java.util.Scanner;

public class PascalTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        int row = 0;

        while(row<n) {
            int i = 0;
            int prod = row;

            while (i < stars) {
                if (i == 0) {
                    System.out.print(1 + "\t");
                } else {
                    System.out.print(prod + "\t");
                    prod = prod * (row - i) / (i + 1);
                }
                i++;
            }
            row++;
            stars++;
            System.out.println();
        }
    }
}

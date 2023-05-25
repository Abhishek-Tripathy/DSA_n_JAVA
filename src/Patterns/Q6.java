package Patterns;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 0;
        while(currRow<n) {
            int i = 1;
            while (i <= currRow*2) {
                System.out.print("  ");
                i++;
            }
            int star = n;
            while (star > currRow) {
                System.out.print(" *");
                star--;
            }
            System.out.println();
            currRow++;
        }
        }
}

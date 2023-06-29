package Lecture6.Patterns;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;
        int spaces = n - 1;
        int stars = 1;

        while (currRow <= n) {
            int i = 1;
            while (spaces >= i) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (stars >= j) {
                System.out.print(1+" ");
                j++;
            }
            stars += 2;
            spaces--;
            currRow++;
            System.out.println();
        }
    }
}

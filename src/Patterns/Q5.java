package Patterns;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 0;
        while(currRow<n){
            int i=1;
            while(i<=currRow){
                System.out.print("  ");
                i++;
            }
            int star = n;
            while (star>currRow){
                System.out.print(" *");
                star--;
            }
            System.out.println();
            currRow++;
        }
    }
}

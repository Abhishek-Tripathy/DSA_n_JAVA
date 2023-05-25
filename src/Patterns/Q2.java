package Patterns;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentRow = 1;

        while(currentRow<=n){

            int i=1;
            while (i<=currentRow){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            currentRow++;
        }
    }
}

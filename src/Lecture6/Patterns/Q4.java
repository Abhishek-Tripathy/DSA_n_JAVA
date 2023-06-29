package Lecture6.Patterns;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currentRow = 1;
        int spaces = n;

        while(currentRow<=n){

            int i =1;
            int star = 1;
            while(i<spaces){

                System.out.print(" ");
                i++;
            }

            while(currentRow>=star){
                System.out.print("*");
                star++;
            }
            System.out.println();
            currentRow++;
            spaces--;
        }
    }
}

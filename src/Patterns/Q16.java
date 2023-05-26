package Patterns;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;
        int spaces = n-1;
        int stars = n;

        while(currRow<=2*n-1){
            int i = 1;
            while(spaces>=i){
                System.out.print(" \t");
                i++;
            }

            int j = 1;
            while(stars>=j){
                System.out.print("*\t");
                j++;
            }
            if(currRow>=n){
                stars++;
                spaces++;
            }else {
                stars --;
                spaces--;
            }
            currRow++;
            System.out.println();
        }
    }
}

package Lecture6.Patterns;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int currRow = 1;
            int spaces = 0;
            int stars = 2*n-1;

            while(currRow<=n){
                int i = 1;
                while(spaces>=i){
                    System.out.print("  ");
                    i++;
                }
                int j = 1;
                while(stars>=j){
                    System.out.print("* ");
                    j++;
                }
                stars-=2;
                spaces++;
                currRow++;
                System.out.println();
            }
    }
}

package Lecture6.Patterns;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;

        int stars = 1;

        while(currRow<=2*n-1){
            int j = 1;
            while(stars>=j){
                System.out.print("* ");
                j++;
            }
            if(currRow>=n){
                stars--;
            }else {
                stars += 1;
            }
            currRow++;
            System.out.println();
        }
    }
}

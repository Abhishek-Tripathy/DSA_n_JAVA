package Lecture6.Patterns;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 0;
        while(currRow<n){
            int i = 1;

            while(i<=n){
                if(i==currRow+1 || i==n-currRow){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                i++;
            }
            currRow++;
            System.out.println();

        }
    }
}

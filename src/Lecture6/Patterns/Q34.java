package Lecture6.Patterns;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;
        int spaces = n - 1;
        int stars = 1;


        while (currRow <= n) {
            int i = 1;
            while (spaces >= i) {
                System.out.print(" \t");
                i++;
            }
            int j = 1;
            int count = n-(currRow-1);
            while (stars >= j) {

                if(j>currRow){
                    System.out.print(count+"\t");
                    count--;
                }else if(j==currRow){
                    System.out.print(0+"\t");
                    count--;
                }else{
                    System.out.print(count+"\t");
                    count++;
                }
                j++;
            }
            stars += 2;
            spaces--;
            currRow++;
            System.out.println();
        }
    }
}

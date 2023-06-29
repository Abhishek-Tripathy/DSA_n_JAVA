package Lecture6.Patterns;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row =1;

        while(row<= n){
            int count = n;
            int i = 1;
            while(i<=n){
                System.out.print(count+" ");
                i++;
                count--;
            }
            System.out.println();
            row++;
        }
    }
}

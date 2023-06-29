package Lecture6.Patterns;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row =1;
        int num = n;

        while(row<= n){
            int count = n;
            int i = 1;
            while(i<=n){
                if(i==num){
                    System.out.print("* ");
                }else {
                    System.out.print(count + " ");
                }
                i++;
                count--;
            }
            System.out.println();
            row++;
            num--;
        }
    }
}

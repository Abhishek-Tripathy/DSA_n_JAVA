package Patterns;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.printf(" ");
            }
            for(int k=1; k<i*2; k++){
                System.out.printf("*");
            }
            for(int l=n-i; l>=1; l--){
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
}

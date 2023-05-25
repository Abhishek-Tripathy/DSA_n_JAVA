package Patterns;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int currRow = 1;

       while(currRow<=n){
           System.out.print("* ");
           int i = 1;
           while(i<n-1){
               if(currRow==1 || currRow==n){
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }
               i++;
           }
           currRow++;
           System.out.print("*");
           System.out.println();
       }
    }
}

package Assignment;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row =1;
        int space = n-1;
        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            while(j<=n){
               if(row==1 || row==n){
                   System.out.print("*");
               }else if (j==1 || j==n){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

                j++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}

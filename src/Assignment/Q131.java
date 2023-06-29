package Assignment;

import java.util.Scanner;

public class Q131 {
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
                if(i==1 || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("_ ");
                }

                j++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}

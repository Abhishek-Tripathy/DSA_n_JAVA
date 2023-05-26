package Patterns;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int currRow = 1;
        int spaces = n-1;
        int stars = 1;

        while(currRow<=n){
            int i = 1;
            while(spaces>=i){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(stars>=j){
                if(j%2!=0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
                j++;
            }
            stars+=2;
            spaces--;
            currRow++;
            System.out.println();
        }
    }
}

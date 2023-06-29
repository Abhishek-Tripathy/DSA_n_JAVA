package Lecture6.Patterns;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 0;
        int space = (n/2)+1;
        int row =1;

        while(row<= n){
            int i = 1;
            while(i<=space){
               if(space==i || space-star==i){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
                i++;
            }

            if(row>=(n/2)+1){
                space--;
                star-=2;
            }else{
                space++;
                star+=2;
            }
            System.out.println();
            row++;

        }
    }
}

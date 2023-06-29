package Lecture6.Patterns;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int number = 1;
        int temp = 1;

        while(row<= (2*n)-1){

            int i = 1;
            while(i<=number){
                if(i%2!=0) {
                    System.out.print(temp + " ");
                }else{
                    System.out.print("* ");
                }
                i++;
            }
            if(row>=n){
                temp--;
                number-=2;
            }else {
                temp++;
                number += 2;
            }
            row++;
            System.out.println();
        }
    }
}

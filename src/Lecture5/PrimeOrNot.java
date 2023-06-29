package Lecture5;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial =0;
        int i = 2;
        while(i<n){
            if(n%i==0){
               factorial++;

            }
            i++;
        }
        if(factorial>=1){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}

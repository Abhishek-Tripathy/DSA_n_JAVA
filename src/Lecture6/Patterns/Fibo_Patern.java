package Lecture6.Patterns;

import java.util.Scanner;

public class Fibo_Patern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int star = 1;
        int count =1;
        while(row<=n){
            int i =1;
            while(i<=star){
                System.out.print(fibonacci(count)+ "\t");
                i++;
                count++;
            }
            row++;
            star++;
            System.out.println();
        }

    }

    public static int fibonacci(int n){
        int a =0;
        int b=1;
        for(int i=1; i<n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return a;
    }
}

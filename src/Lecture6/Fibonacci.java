package Lecture6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        int a = 0;
        int b = 1;
        for(int i =3; i<=n; i++){

            System.out.printf("%d, ",a);
            int sum = a+b;
            a=b;
            b=sum;
        }
        System.out.print(a+", ");
        System.out.println(b);
    }
}

package Lecture5;

import java.util.Scanner;

public class Lcm_Optimised {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int divident =  sc.nextInt();

        int a = divident;
        int b = divisor;

        while(divident%divisor!=0){
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        int lcm = a*b/divisor;
        System.out.println(lcm);
    }
}

package Assignment;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getLCM(a,b));
    }
    public static int gcd(int a , int b){
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    public static int getLCM(int a, int b){
        return (a*b)/gcd(a,b);
    }
}

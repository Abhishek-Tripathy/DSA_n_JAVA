package Assignment;

import java.util.Scanner;

public class CelsiusConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();

        printConversion(a,b,c);
    }
    public static void printConversion(int a, int b, int c){
        while(a<=b){
            int z = a-32;
            double celsius = (double)z*5/9;
            System.out.println( a+" "+(int)celsius);
            a+=c;
        }
    }
}

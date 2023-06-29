package Assignment;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inverse(n));
    }
    public static int inverse(int n){
        int count = 1;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = sum + count* (int) Math.pow(10,rem-1);
            count++;
            n/=10;
        }
        return sum;
    }

}

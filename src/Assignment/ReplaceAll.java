package Assignment;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(replace(n));

    }
    public static long replace(long n){
        long sum = 0;
        long mul =1;
        while(n>0){
            long rem = n%10;
            if(rem == 0){
                rem=5;
            }
            sum = sum + (mul*rem);
            n=n/10;
            mul*=10;
        }
        return sum;
    }
}

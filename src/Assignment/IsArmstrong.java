package Assignment;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    public static int digitCount(int a){
        int count =0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }

    public static boolean isArmstrong(int n){
        int sum=0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            sum = sum + (int) Math.pow(rem,digitCount(temp));
            n=n/10;
        }
        if(sum==temp){
            return true;
        }else{
            return false;
        }
    }
}

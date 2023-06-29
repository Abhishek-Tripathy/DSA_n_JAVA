package Assignment;

import java.util.Scanner;

public class SumOddPlacedEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }

    public static int digitCount(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void sum(int n){
        int sum1 = 0;
        int sum2 = 0;
        int count=digitCount(n);
        while(n>0){
           int rem = n%10;
           if(count%2==0){
               sum1+=rem;
           }else{
               sum2+=rem;
           }
           n/=10;
           count--;
        }
        System.out.println(sum1+"\n"+sum2);
    }
}

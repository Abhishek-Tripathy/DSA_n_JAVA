package Assignment;

import java.util.Scanner;

public class Boston {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isBoston(n));
    }

    public static int sumOfDigits(int n){
        int sum =0;
        while (n > 0) {
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static int isBoston(int n){
        int temp = n;
        int i=2;
        int sum=0;
        while(n>=i){
            if(n%i==0){
                sum+=sumOfDigits(i);
                n/=i;
            }else{
                i++;
            }
        }
       if(sumOfDigits(temp)==sum){
           return 1;
       }else{
           return 0;
       }
    }
}


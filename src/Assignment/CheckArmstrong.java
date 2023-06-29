package Assignment;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        for(int i = N1; i<=N2; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int a){
        int sum =0;
        int temp = a;
        while (a>0){
            int rem =a%10;
            sum = sum + (int) Math.pow(rem,countDigit(temp));
            a/=10;
        }
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
}

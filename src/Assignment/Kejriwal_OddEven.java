package Assignment;

import java.util.Scanner;

public class Kejriwal_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            if(check(arr[j])){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean check(int n){
        int evenSum =0;
        int oddSum =0;
        while(n>0){
            int rem = n%10;
            if(rem % 2 == 0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            n/=10;
        }
        if(evenSum%4==0 || oddSum%3==0){
            return true;
        }else{
            return false;
        }
    }
}

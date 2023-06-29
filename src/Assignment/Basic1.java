package Assignment;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int sumOddPlaced = 0;
        int sumEvenPlaced = 0;

        while(n!=0){
            count++;
            int rem = n%10;
            n = n/10;
            if(count%2==0){
                sumEvenPlaced+=rem;
            }else{
                sumOddPlaced+=rem;
            }
        }
        System.out.println();
    }
}

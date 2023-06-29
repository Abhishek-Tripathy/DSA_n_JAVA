package Assignment;

import java.util.Scanner;

public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(invert(n));
    }

    public static long invert(long n){
        long ans =0;
        long mul =1;
        while(n>0){
            long rem = n%10;
            if(n==9){
                ans+=mul*rem;
            } else if(rem>=5){
                ans+=mul*(9-rem);
            }else{
                ans+=mul*rem;
            }
            mul*=10;
            n=n/10;
        }
        return ans;
    }
}

package Assignment;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int space = 0;
        int element = (2*n)+1;
        int num = n;

        while(row<=(2*n)+1){
            int number = num;
            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            while(j<=element){
                System.out.print(number+" ");
                if(j>element/2){
                    number++;
                }else{
                    number--;
                }j++;
            }
            if(row>n){
                element+=2;
                space--;
                num++;
            }else{
                element-=2;
                space++;
                num--;
            }
            row++;
            System.out.println();
        }
    }
}

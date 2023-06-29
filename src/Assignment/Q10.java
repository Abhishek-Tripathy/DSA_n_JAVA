package Assignment;

import java.util.Scanner;

public class Q10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 0;
        int element = (2 * n) + 1;
        int number = n;

        while(row<=(2*n)+1){
            int i =1;
            while(i<=space){
                  System.out.print("  ");
                  i++;
            }
            int j =1;
            int num = number;
            while(j<=element){

                if(j>element/2){
                    System.out.print(num+" ");
                    num++;
                }else{
                    System.out.print(num+" ");
                    num--;
                }
                j++;
            }
            if(row>n){
                space--;
                element+=2;
                number++;
            }else{
                number--;
                space++;
                element-=2;
            }
            System.out.println();
            row++;
        }
    }
}

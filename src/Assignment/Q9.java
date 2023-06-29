package Assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = (2*n)-1;
        int row =1;
        int element1=1;
        int num = n;
        while(row<=(2*n)+1){
            int i = 1;
            int num1 = n;
            while(i<=element1){
                System.out.print(num1+" ");
                num1--;
                i++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            if(row==(n+1)){
               k=2;
            }
            int num2=num;
            if(row==(n+1)){
                num2++;
            }
            while(k<=element1){
                System.out.print(num2+" ");
                num2++;
                k++;
            }
            if(row>=n+1){
                space+=2;
                element1--;
                num++;
            }else {
                space-=2;
                element1++;
                num--;
            }
            row++;
            System.out.println();
        }
    }
}

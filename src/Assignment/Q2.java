package Assignment;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int space1=n-1;
        int space2 = -1;
        int elements = 1;

        while(row<=n){
            int i = 1;
            int num = elements;
            while(i<=space1){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=elements){
                System.out.print(num+" ");
                j++;
                num--;
            }
            int k =1;
            while(k<=space2){
                System.out.print("  ");
                k++;
            }
            int s =1;
            while(s<=elements){
                if(row==1 || row==n){
                    break;
                }
                System.out.print(s+" ");
                s++;
            }
            if(row>(n/2)){
                space2-=2;
                space1+=2;
                elements--;
            }else{
                space2+=2;
                space1-=2;
                elements++;
            }
            row++;
            System.out.println();
        }
    }
}

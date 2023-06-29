package Assignment;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row =1;
        int space = (2*n)-3;
        int element =1;

        while(row<=n){
            int i=1;
            int num =1;
            while(i<=element){
                if(i==n){
                    //System.out.print("");
                }else {
                    System.out.print(num + " ");
                }
                i++;
                num++;
            }
            int j =1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;

            num--;
            while(k<=element){
                System.out.print(num+" ");
                k++;
                num--;
            }
            row++;
            element+=1;
            space-=2;
            System.out.println();
        }
    }
}

package Assignment;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int star = 1;
        int row=1;
        int sum =1;
        while(row<=n){
            int i =1;
            while(i<=star){
                System.out.print(sum+"\t");
                i++;
                sum++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}

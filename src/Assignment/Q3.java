package Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars =1;
        int spaces = n-1;
        int rows =1;
        int num = 1;
        while(rows<=(2*n)-1){
            int element=num;
            int i = 1;
            while(i<=spaces){
                System.out.print(" \t");
                i++;
            }
            int j =1;
            while(j<=stars){

                System.out.print(element+"\t");
                if(j>stars/2){
                    element--;
                }else {
                   element++;
                }
                j++;
            }
            if(rows>=n){
                stars-=2;
                spaces++;
                num--;
            }else{
                stars+=2;
                spaces--;
               num++;
            }
            rows++;
            System.out.println();
        }
    }
}

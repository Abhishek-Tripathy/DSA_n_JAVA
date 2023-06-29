package Assignment;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        seriesPrint(N1, N2);
    }

    public static void seriesPrint(int a, int b) {

        int i = 1;
        int count =1;
        while(count<=a){
            int c = (i*3)+2;
            if(c%b!=0){
               count++;
               System.out.println(c);
            }
            i++;
        }
    }

}
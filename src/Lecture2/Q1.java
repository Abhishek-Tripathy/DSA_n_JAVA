package Lecture2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRows = sc.nextInt();
        int currRow = 1;
        int stars = 5;

        while(currRow <= totalRows){

            int i =1;
            while(i<=stars){
                System.out.print("* ");
                i++;
            }
            currRow++;
            stars--;
            System.out.println();
        }
    }
}

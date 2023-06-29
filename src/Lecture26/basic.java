package Lecture26;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
//        int [][] arr = null;
//        System.out.println(arr);
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for(int j =0; j< col; j++){
                arr[i][j] =  sc.nextInt();
            }
        }
        display(arr);
    }
    public static void display(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Lec15_Array;

import java.util.Scanner;

public class Arraydisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n];

        for(int i =0; i<n; i++){
            marks[i] = sc.nextInt();
        }

        displayArray(marks);
    }
    public static void displayArray(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

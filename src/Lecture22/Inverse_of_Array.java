package Lecture22;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        inverseArray(arr);
    }
    public static void inverseArray(int[] arr){
        int [] arr1 = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            arr1[arr[i]] = i;
        }
        display(arr1);
    }
    public static void display(int[] arr){
        for (int i = 0; i < arr.length  ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

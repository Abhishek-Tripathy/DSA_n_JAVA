package Lrcture9;

import java.util.Scanner;

public class INsertionSort {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int n = scc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scc.nextInt();
        }
        sort(arr);
    }
    public  static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int base =  arr[i];
            int baseIdx = i;
            int j = baseIdx-1;
            while(j>=0 && arr[j]>base){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = base;
        }
        display(arr);
    }
    public static void display(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

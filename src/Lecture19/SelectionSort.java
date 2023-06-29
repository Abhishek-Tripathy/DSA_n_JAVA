package Lecture19;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int n = scc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scc.nextInt();
        }
        sort(arr);
    }
    public static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int base = arr[i];
            int minIdx = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minIdx]>arr[j]){
                    //minIdx=j;
                    int temp = arr[minIdx];
                    arr[minIdx] = arr[j];
                    arr[j] = temp;
                }
            }
//            swap(arr,i,minIdx);
        }
        display(arr);
    }
    public static void display(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

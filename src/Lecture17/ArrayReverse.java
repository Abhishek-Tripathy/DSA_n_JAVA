package Lecture17;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr = {-1, 2, 3, -9, -5, 10,-2, 4, 5};
        int [] arr1 = {2, -3, 4, -9, -3, 7, -8};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("_________________________________________");
        System.out.println(Arrays.toString(arr1));
        reverseWithinRange(arr1, 2, 5);
        System.out.println(Arrays.toString(arr1));
    }
    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void reverseWithinRange(int arr[] , int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

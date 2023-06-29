package Lecture17;

import java.util.Arrays;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int [] arr  = {1, -2, 5, 3, -9, 6};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap (int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
    public static void Reverse(int [] arr) {
        for (int i = 0, j = arr.length - 1;
        i < arr.length/2 && j >= 0;
        i++, j--) {
            swap(arr, i, j);
        }
    }
}

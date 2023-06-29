package Lecture19;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {3, 5, -7, 4, 8, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int baseInd = i;
            int base = arr[baseInd];
            int j = baseInd-1;
            while(j>=0 && base<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = base;
        }
    }
}

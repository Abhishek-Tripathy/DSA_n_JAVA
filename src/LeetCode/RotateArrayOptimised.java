package LeetCode;

import java.util.Arrays;

public class RotateArrayOptimised {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        k = k% arr.length;
        System.out.println(Arrays.toString(arr));
        reverseWithinRange(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverseWithinRange(arr, arr.length-k-1, arr.length-1 );
        System.out.println(Arrays.toString(arr));
        reverseWithinRange(arr, 0, k-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseWithinRange(int arr[] , int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void swap (int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}

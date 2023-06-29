package Lecture22;

import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        
        System.out.println(Arrays.toString(product(arr)));
    }
    public static int[] product(int[] arr){
        int prod =1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod*arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prod/arr[i];
        }
        return arr;
    }
}

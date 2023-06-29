package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target =  sc.nextInt();
        sumPairs(arr,target);
    }
    public static void sumPairs(int [] arr, int target){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}

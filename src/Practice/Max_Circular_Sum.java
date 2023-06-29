package Practice;

import java.util.Scanner;

public class Max_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t =sc.nextInt();
        for(int loop =1; loop<=t; loop++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(subarray(arr));
        }
    }
    public static int subarray (int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int arraySum =0;

        for (int i = 0; i < arr.length; i++) {
            int tempMaxSum = 0;
            int tempMinSum = 0;
            arraySum += arr[i];
            for(int j = i; j< arr.length; j++){
                tempMaxSum += arr[j];
                maxSum = Math.max(maxSum,tempMaxSum);
                tempMinSum += arr[j];
                minSum = Math.min(minSum,tempMinSum);
            }
        }
        if(arraySum==minSum){
            return maxSum;
        }else{
            return Math.max(maxSum, arraySum-minSum);
        }
    }
}

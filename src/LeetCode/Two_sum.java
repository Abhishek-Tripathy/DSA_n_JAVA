package LeetCode;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {

    }
    public static void target(int [] arr, int target){
        int i = 0;
        int j = arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("[" + i + "," + j + "]");
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j++;
            }
        }
    }

}

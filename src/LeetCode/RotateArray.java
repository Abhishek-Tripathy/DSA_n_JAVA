package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] arr = getIntegers();
//        int k = sc.nextInt();
//        System.out.println(Arrays.toString(rotate(arr,3)));
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int n){
        n = n% arr.length;
        int j=1;
        while(j<=n){
            int k = arr.length-1;
            int temp = arr[k];
            for(int i=k; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            j++;
        }
    }
    public static int[] getIntegers(){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the input integer delimited by comma : ");
        String input = sc.nextLine();
        String[] split = input.split(",");
        int[] values = new int[split.length];
        for(int i=0; i< split.length; i++){
            values[i] = Integer.parseInt(split[i].trim());
        }
        return values;
    }
}

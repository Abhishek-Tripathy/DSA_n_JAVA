package Lecture17;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = getIntegers();
        int k = sc.nextInt();
        arr = rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] rotate(int[] arr, int n){
        int[] temp = new int[arr.length];
        int i =0;
        int k = arr.length-n;
        int j =0;
        while(i< arr.length){
            if(k< arr.length){
                temp[i] = arr[k];
                k++;
            }else if(j< arr.length){
                temp[i] = arr[j];
                j++;
            }
            i++;
        }
        return temp;
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

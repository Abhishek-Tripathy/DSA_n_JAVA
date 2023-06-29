package Lec15_Array;

public class Array_HardCode_value {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);
        displayArray(arr);
    }
    public static void displayArray(int[] arr){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}

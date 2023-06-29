package Lecture22;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,9,7,11,6};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        right[right.length-1] = arr[arr.length-1];
        int sum =0;
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i],left[i-1] );
        }
        for (int i = arr.length-2; i>= 0; i--) {
            right[i] = Math.max(right[i+1],arr[i] );
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }
}

package Lecture17;

public class Min_in_array {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -9, -6};
        System.out.println(minIndex(arr));
        System.out.println(secondMinIndex(arr));
        System.out.println(minelement(arr));
        System.out.println(Secminelement(arr));
    }
    public static int minelement(int [] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int Secminelement(int [] arr){
        int min = arr[0];
        int sec = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                sec = min;
                min = arr[i];
            }
        }
        return sec;
    }
    public static int minIndex(int [] arr){
        int minIdx = 0;
        for(int i =1; i<arr.length; i++){
            if(arr[minIdx] > arr[i]){
                minIdx=i;
            }
        }
        return  minIdx;
    }
    public static int secondMinIndex(int [] arr){
        int minIdx = 0;
        int secMIn =0;
        for(int i =1; i<arr.length; i++){
            if(arr[minIdx] > arr[i]){
                secMIn = minIdx;
                minIdx=i;
            }else if(secMIn>arr[i]){
                secMIn=i;
            }
        }
        return  secMIn;
    }
}


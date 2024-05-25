package Recursion;

public class IsSorted {

    public static boolean issortedCheck(int[] arr, int idx){

        if(idx==arr.length-1){
            return true;
        }

        if(arr[idx]<arr[idx+1]){
            return issortedCheck(arr, idx+1);
        }
        else{
            return false;
        }
            
    }
    public static boolean isSorted(int[] arr){
        return IsSorted.issortedCheck(arr, 0);
    }
    
}

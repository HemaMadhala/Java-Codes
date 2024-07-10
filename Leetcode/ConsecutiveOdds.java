package Leetcode;

public class ConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
        System.out.println(threeConsecutiveOddsO1(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
            else if(count>=3){
                return true;
            }
            else {
                count=0;
            }
        }

        return count>=3;
    }

    public static boolean threeConsecutiveOddsO1(int[] arr) {
        if(arr.length < 3) return false;
        for(int i=0;i<arr.length-2;i++){
            if((arr[i]%2)==1 && arr[i+1]%2==1 && arr[i+2]%2==1) return true;
        }

        return false;
    }

}

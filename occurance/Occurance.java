package occurance;

import Recursion.fibonacci;

public class Occurance {
     public static int[] searchRangeUsingBrute(int[] nums, int target) {
        int first=-1,last=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            if(first==-1){
                first=i;
            }
            last=i;
        }
       }
       return new int[]{first,last};
    }

    public static int[] searchRangeUsingTwopointer(int[] nums, int target){
        int first = -1, last = -1;
        int i=0,j=nums.length;
        while (i<j) {
            int mid= i + (j-1)/2;

            if(nums[mid]==target){
                first=mid;
                last=mid;

                while (mid>0 && nums[first-1]==target) {
                    i--;
                }
                while (mid<nums.length && nums[last+1]) {
                    j++;
                }
            }
            else if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }

        return new int[]{first,last};
    }

}

package SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid= i + ((j-1)/2);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}

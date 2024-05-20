import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {

    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
                return new int[]{i,map.get(val)};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
        
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(twoSum(nums,target));
    }
    
}

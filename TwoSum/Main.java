package TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(BruteForce.twoSum(array, target)));
        System.out.println(Arrays.toString(TwoSumHashMap.twoSum(array, target)));
    }
}

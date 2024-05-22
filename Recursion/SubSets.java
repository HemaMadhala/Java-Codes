package Recursion;

import java.util.ArrayList;

public class SubSets {
    public static void sub(String s, int idx, String newS){
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }

        char cur=s.charAt(idx);

        sub(s, idx+1, newS+cur);
        sub(s, idx+1, newS);
    }
    public static void subset(int[] nums, int idx, ArrayList<Integer> list){
        if(idx==nums.length){
            System.out.println(list);
            return;
        }

        int cur=nums[idx];
        subset(nums, idx+1, list);
        list.add(cur);
        subset(nums, idx, list);
    }
}

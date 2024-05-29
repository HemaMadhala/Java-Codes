package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

    public static ArrayList<String> subArray(String s, int idx, ArrayList<String> newArray, String news){
        return newArray;
    }

    public static void subsetofIntegers(int[] nums, int i,ArrayList<ArrayList<Integer>> a,ArrayList<Integer> b){

        if(nums.length==i){
            a.add(new ArrayList<>(b));
            System.out.println(a);
            return;
        }
        
        
        subsetofIntegers(nums, i+1, a, b);
        b.add(nums[i]);
        subsetofIntegers(nums, i+1, a, b);
        b.remove(b.size()-1);
    }

}

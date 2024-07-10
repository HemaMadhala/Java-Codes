package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ar=new ArrayList<>();
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                ar.add(nums1[i]);
                i++;j++;
            }
        }
        System.out.println(ar);
        int[] result = new int[ar.size()];
        for (int k = 0; k < ar.size(); k++) {
            System.out.println(k);
            result[k] = ar.get(k);
        }
        
        return result;
    }
}

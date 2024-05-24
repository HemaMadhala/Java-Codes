package occurance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={1,1,8,8,8,8,9};
        int target=1;
        //System.out.println(Occurance.occ("abac", 'a'));
        System.out.println(Arrays.toString(Occurance.searchRangeUsingBrute(array, target)));
    }
}

package RemoveDuplicates;

import java.util.HashSet;

public class Hasing {

    public static int removeDup(int [] arr){
        int k=0,index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int a: arr){
            if(!set.contains(a)){
                set.add(a);
                arr[index]=arr[index+1];
                index++;
                k++;
            }
        }
        return k;
    }
    
}

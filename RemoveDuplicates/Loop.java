package RemoveDuplicates;

import java.util.Arrays;

public class Loop {
    public static int duplicate(int [] arr){
        int in=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]==arr[i]){
                arr[i]=arr[i+1];
                in++;

            }
        }
        System.out.println(Arrays.toString(arr));
        return in;
    }
    
}

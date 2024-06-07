import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChar {
    public static void main(String[] args) {
        String[] words=new String[]{"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        int[] arr=new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        System.out.println(Arrays.toString(arr));

        for(String word:words){
            int [] temp=new int[26];
            for(char c:word.toCharArray()){
                temp[c-'a']++;
            }

            for(int i=0;i<26;i++){
                arr[i]=Math.min(arr[i], temp[i]);
            }
        }
        System.out.println(Arrays.toString(arr));

        List<String> list=new ArrayList<>();
        
        for(int i=0;i<26;i++){
            for(int j=0;j<arr[i];j++){
                list.add(String.valueOf((char)(i+'a')));
            }
        }
        return list;
        
    }
}

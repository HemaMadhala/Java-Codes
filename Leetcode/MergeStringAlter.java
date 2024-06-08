import java.lang.*;
public class MergeStringAlter {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
        System.out.println(mergeAlternatelyOptimal(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                sb=sb.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                sb=sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }
    //optimized way

    public static String mergeAlternatelyOptimal(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int len=Math.min(word1.length(),word2.length());
        for(int i=0;i<len;i++){
            sb=sb.append(word1.charAt(i));
            sb=sb.append(word2.charAt(i));
        }
        return sb.append(word1.substring(len)).append(word2.substring( len)).toString();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {
        String s="  hello world  ";
        String s2= "a good   example";
        System.out.println("'"+reverseWords(s)+"'");
        System.out.println("'"+reverseWords(s2)+"'");
    }

    public static String reverseWords(String s) {
        String[] words =s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.substring(0,sb.length()-1).toString();
    }
}

package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static public  boolean  vowel(String s){
        return s.toLowerCase().matches(".*[aeiou]*");
    }
    public static boolean check(String s){
        return s.toLowerCase().matches("[a-zA-Z]+");
    }
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile(".*[aeiou]*");
        Matcher matcher=pattern.matcher("aa");
        boolean m=matcher.matches();

        System.out.println(vowel("Hello"));
        System.out.println(check("sdfgh"));
    }
    
}

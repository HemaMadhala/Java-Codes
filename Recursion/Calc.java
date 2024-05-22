package Recursion;

public class Sum {
    public static void sumOfNaturalNumbers(int i, int n, int sum){
        if(i==n+1){
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNaturalNumbers(i+1, n, sum);
    }
    
}

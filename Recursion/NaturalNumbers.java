package Recursion;

public class NaturalNumbers {

    public static void printNumAsc(int i, int n){
        if(i==n+1){
            return;
        }
        System.out.println(i);
        printNumAsc(i+1, n);
    }
    public static void printNumDes(int i, int n){
        if(i==n+1){
            return;
        }
        printNumDes(i+1, n);
        System.out.println(i);
    }
    
}

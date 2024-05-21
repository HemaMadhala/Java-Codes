package SwapNumbers;

public class Temp {
    public static void swap(int a, int b){

        int temp=0;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Using Temp variable");
        System.out.println("After swapping : a = "+a+" , b = "+ b);
    }
    
}

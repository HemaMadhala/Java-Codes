package SwapNumbers;

public class WithoutTemp {
    public static void swap(int a, int b){

        // a=1, b=2
         a=a+b; // a=3
         b=a-b; //b=3-2=1
         a=a-b;
         System.out.println("Without using Temp variable");
         System.out.println("After swapping : a = "+a+" , b = "+ b);
     }
}

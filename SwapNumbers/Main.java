package SwapNumbers;

public class Main {
    public static void main(String[] args) {
        int a=1,b=5;
        System.out.println("Before swapping : a = "+a+" , b = "+ b);
        Temp.swap(a, b);
        WithoutTemp.swap(a, b);
    }
}

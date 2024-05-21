package IntegerReversal;

public class Main {

    public static int reverse(int i){
       int reversal=0, rem=0;
       while(i!=0){
        rem=i%10;
        reversal=(reversal*10)+rem;
        i=i/10;
       }
       return reversal;
    }
    public static void main(String[] args) {
        System.out.println("--------");
        System.out.println(reverse(123));
    }
}

package Core;

public class Copy implements Cloneable{

    int x;

    public static void main(String[] args) {

        //shallow copy
        Copy c1=new Copy();
        c1.x=10;
        Copy c2=c1;
        c2.x=12;
        System.out.println(c1.x);
        System.out.println(c2.x);

        //deep copy

        Copy c3=new Copy();

        

    }
    
}

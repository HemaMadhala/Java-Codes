package Recursion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //NaturalNumbers.printNumAsc(0, 10);
        //NaturalNumbers.printNumDes(0, 10);
        //Calc.sumOfNaturalNumbers(0, 3, 0);
        //System.out.println(Factorial.fact(5));
        //SubSets.sub("ab", 0, "");

        int[] arr={1};
        ArrayList<Integer> list=new ArrayList<>();
        SubSets.subset(arr, 0, list);

    }
    
}

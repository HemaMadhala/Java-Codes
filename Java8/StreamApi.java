package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("kiran");s.add("hina");s.add("harim");s.add("mino");s.add("githa");s.add("shalini");s.add("naresh");

        List<String> sortedIntegers1= s.stream().filter(i->i.contains("h")).sorted().collect(Collectors.toList());
        List<String> sortedIntegers2 = s.stream().sorted().collect(Collector.);
        System.out.println("Sorted : "+ sortedIntegers1);
        System.out.println("Sorted : "+ sortedIntegers2);

    }
}

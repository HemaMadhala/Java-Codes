package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Colecti {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1, 1);
        map.put(5,5);
        map.put(0,0);
        map.put(2, 2);
        map.put(3, 3);

        Map<String,Integer> map2=new HashMap<>();
        map2.put("gi", 2);map2.put("aa", 2); map2.put("hi", 65);map2.put("aaa", 0);
 
        List<String> s=new ArrayList<>();
        s.add("V");
        s.add("E");
        s.add("E");
        s.add("e");
        s.add("V");
        // for(Map.Entry<Integer, Integer> en: map.entrySet()){
        //     System.out.println(en.getKey()+","+ en.getValue());
        // }
        Map<Integer,Integer> m1=new HashMap<>();
        m1=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue));
        System.out.println(m1);
        List<String> s2= s.stream().distinct().toList();
        System.out.println(s2);
        Map<String,Integer> m2=new HashMap<>();
        System.out.println("_-______________");
        m2 = map2.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue,newValue)->oldValue));
        System.out.println(m2);
    
    }
}

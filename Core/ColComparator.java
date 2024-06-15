package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(26);
        list.add(51);
        list.add(80);

        Comparator<Integer> com=new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }
                else return -1;
            }
            
        };
        Collections.sort(list, com);

        System.out.println(list);

        ArrayList<Student> stud=new ArrayList<>();
        stud.add(new Student(2, "kari"));
        stud.add(new Student(5,"hema"));
        stud.add(new Student(1,"spruha"));
        Comparator<Student> com1=new Comparator<Student>() {

            @Override
            public int compare(Student i, Student j) {
                if(i.id < j.id){
                    return 1;
                }
                else return -1;
            }
            
        };
        Collections.sort(stud,com1);
        System.out.println(stud);

        ArrayList<String> names=new ArrayList<>();
        names.add("he");
        names.add("Vivek");
        names.add("Vishnu");

        
        Collections.sort(names);
    }
}

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}

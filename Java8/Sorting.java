package Java8;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(1); list.add(0); list.add(9);

        ArrayList<Student> stud=new ArrayList<>();
        stud.add(new Student(2, "kari"));
        stud.add(new Student(5,"hema"));
        stud.add(new Student(1,"spruha"));

        Student com=new Student();
        stud.stream().sorted().forEach(System.out::println);
    }
}
class Student implements Comparator<Student>{
    int id;
    String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id>o2.id ? 1: -1;
    }

}

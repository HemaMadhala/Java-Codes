package Core;

import java.util.HashSet;
import java.util.Set;

public class Equals {
    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        set.add(new Student(1, "a"));
        set.add(new Student(1, "b"));
        set.add(new Student(2, "c"));

        Set<Student> set2=new HashSet<>();
        set2.add(new Student(1, "a"));
        set2.add(new Student(1, "b"));
        set2.add(new Student(2, "c"));

        //System.out.println(set.equals(set2));
        int i=10;
        int j=10;
        System.out.println(i==j);


    }

}

class Student{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    
}

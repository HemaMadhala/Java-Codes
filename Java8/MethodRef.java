package Java8;

public class MethodRef {
    public static void main(String[] args) {

        Work w1=(s)->System.out.println("Working");;
        Work w2= Task::task;
        
        w1.work("hu");
        w2.work("Hema");
    }
}
 interface Work {
    public void work(String s);
}
 class Task {
    public static void task(String s){
        System.out.println("Assigned task to " + s);
    }
}


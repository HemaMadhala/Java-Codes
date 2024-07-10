package Core;

public class Generics {
    public static void main(String[] args) {
        Str<String> s=new Str<>();
        s.name="hema";
        s.display();
    }
}

class Str<T>{
    T name;

    Str(){

    }

     void display(){
        System.out.println("Welcome "+this.name);
    }
}

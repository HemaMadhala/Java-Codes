package Core;

public class Innerclass{
    public static void main(String[] args) {
        Age oj1 = new Age() { 
            
            @Override public void getAge() 
            { 
                // printing  age 
                System.out.println("Age is " + x); 
            } 
            @Override
            public void getGender() {
                System.out.println("Gender");
            }
        
        }; 
        oj1.getAge();
        oj1.getGender();

        Inner in=new Inner() {
            @Override
            public void inner() {
                System.out.println("Inner");
            }
        };
    }
}

interface Inner{

    void inner();

    
}
interface Age { 
    int x = 21; 
    void getAge(); 
    void getGender();
} 
  
package Core;

public class PrivateConst extends Const{

    //PrivateConst(){
        //super();
    //}

    PrivateConst(int i) {
        super(i);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Const c=new PrivateConst(0);
    }
}

class Const{
    private Const(){
        System.out.println("Private");
    }

    Const(int i){
        System.out.println();
    }
}

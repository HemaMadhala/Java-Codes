package Core;

public class PrivateConst extends Const{

    PrivateConst(){
        super();
    }

    public static void main(String[] args) {
        Const c=new PrivateConst();
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

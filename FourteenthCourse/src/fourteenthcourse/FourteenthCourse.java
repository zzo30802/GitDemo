package fourteenthcourse;
class Father{
    public Father(char a){  //有參數的建構子
        System.out.println("這是父類別建構子"+a);
        }  
    }
class Son extends Father{
    public Son(){   //建構子
        this('A');  //呼叫自己有待參數之建構子
        }
    public Son(char a){
        super(a);
        System.out.println("這是子類別有帶參數的建構子"+a);
        }
    }
public class FourteenthCourse {
    public static void main(String[] args) {
    Son s=new Son();   //new Son();也行呼叫出建構子
    System.out.println(s);
    }
    
}

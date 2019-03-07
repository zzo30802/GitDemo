package thirteenthcourse;
class Father2{
    public Father2(){
        System.out.println("這是父類別得預設建構子");
        }
    }
class Son2 extends Father2{
    public Son2(){
        //這裡會有一行 預設建構子 super();   //故這行會呼叫父類別的內容
        System.out.println("這是子類別的預設建構子");
        }
    //方法之多載
    public Son2(String r){
        //這裡會有一行 預設建構子 super();   //故這行會呼叫父類別的內容
        System.out.println("這是子類別的預設建構子");
        }
    }
public class InheritConstructor {
    public static void main(String[] args) 
    {
    Son2 s= new Son2();
    Son2 r= new Son2("Hello");
    }
}
package abstracttest;
abstract class Fish{
    String name;  //類別變數不需要初值
    void someMethod(){
    System.out.println("這是一般方法");
    }
    private void b(){};  //一般方法可以宣告private
   // void c();    //抽象方法不可以宣告private  ????????????????????????????
}
interface Pet{
    String petName="dog";
    void someMethod();
    }
public class AbstractTest {
    public static void main(String[] args) {
  //  Pet a=new Pet();  //Pet是抽象類別無法實作
    }
    
}
/*
*介面interface
1.宣告介面=>
interface 介面名稱{
    裡面一定要是抽象方法
    }

*abstract 抽象類別與抽象方法
1.宣告抽象類別,語法
abstract class 類別名稱{
    //宣告變數不一定要設定初值
    類別內可包含
    a.一般方法
    b.抽象方法
    }
    ps.若類別的內有抽象方法，則此類別需宣告為abstract
2.抽象類別無法實作物件
3.抽象方法不能宣告為private,因為無法被子類別實作
4.抽象方法不能有實作區塊 ex: void abstractMethor();
*/
package interfacetest;
//interface Fish
interface Fly {
    //屬性前預設public static final
    String name="我是鯊魚";
    void fly();
    //介面裡的一般方法前面要加default，否則會產生編譯錯誤
    default void test(){
        System.out.println("我是介面裡的一般方法");
        }
}
//interface Swimmer
interface Swimmer {
    void swim();//介面裡的方法前面預設 public abstract    
}
//抽象類別(父)Fish實作介面Swimmer
abstract class Fish implements Swimmer{}

////宣告Shark類別並繼承Fish
class Shark extends Fish{
    @Override   //因為Shark繼承了Fish，Fish又繼承介面Swimmer的swim()，所以必須實作swim()
    public void swim(){
        System.out.println("我是鯊魚，我會游泳");
        }
    }

//宣告FlyingFish繼承Fish並實作Fly介面
class FlyingFish extends Fish implements Fly{
    @Override
    public void swim() {
        System.out.println("我是飛魚，我會游泳");
        }
    @Override
    public void fly() {
        System.out.println("我是飛魚，我會飛");
        }   
}

//產生超人類別並實作Swimmer及Fly介面
class Superman implements Swimmer,Fly{
    @Override
    public void swim() {
        System.out.println("我是超人，我會游泳");
    }
    @Override
    public void fly() {
        System.out.println("我是超人，我會飛");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
    Shark s=new Shark();  //實作物件 指定stack裡的s路徑到heap裡的shark()空間
    s.swim();             
    FlyingFish f=new FlyingFish();
    f.fly();
    f.swim();
    Superman hero=new Superman();
    hero.fly();
    hero.swim();
    }
    
}
/*
interface 介面
1.設定屬性需設定初始值(抽象類別不用)
2.設定內只能有抽象方法(抽象類別中也可以有一般方法)
3.介面可繼承多個介面(抽象類別為單一繼承)
4.介面不可實作物件(抽象類別也不行)
5.介面使用implements關鍵字
6.屬性前面一定會加 public static final
  方法前面一定會加 public abstract
7.介面裡使用一般方法需要加上 default
*/
package abstracttest1;
abstract class Fish{
    String name;
    int speed;
    
    //宣告一般方法
    public String swim(){  //一般方法並要回傳String
        return "在水中游泳";
        }
    
    //宣告設定性名之抽象方法
    public abstract void setName(String name);
    
    //宣告設定速度之抽象方法
    public abstract void setSpeed(int speed);
    
    //宣告設定資訊之抽象方法        
    public abstract void info();       
    }

//宣告Shark類別繼承Fish
class Shark extends Fish{
    //設定setName之實作方法
    @Override
    public void setName(String name){
        this.name=name;
        System.out.println("鯊魚的名稱"+this.name);
        }
    //設定setSpeed之實作方法
    @Override
    public void setSpeed(int speed){
        this.speed=speed;
        System.out.println("鯊魚的速度"+this.speed);
        }
    public void info(){
        System.out.printf("鯊魚名稱 %s %s %d m/s %n",name,swim(),speed);
        }
    }
public class AbstractTest1 {
    public static void main(String[] args) {
    Shark s=new Shark();
    s.setName("大白鯊");
    s.setSpeed(100);
    s.info();
    }
    
}

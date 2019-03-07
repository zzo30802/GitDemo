package polymorphismtest;
class Animal{   //宣告一個類別
    public void move(){   //宣告一個方法
        System.out.println("這是Ani,al類別的移動");
        }
    }
class Cats extends Animal{  //宣告類別
    String name="我是貓科";
    String getName(){
        return name;
        }
    String greeting(){
        return "大家好，我是貓科，多多指教";
        }
    @Override
    public void move(){
        System.out.println("這是Cats類別的移動，跑跑跳跳....");
        }
    public void skill(){
        System.out.println("這是Cats類別的技能，洗澡...");
        }
    }
class Birds extends Animal{
    @Override
    public void move(){
        System.out.println("這是Birds類別的移動，飛飛飛....");
        }
    }
class Tiger extends Cats{
    String name="我是老虎";
    @Override
    String getName(){return name;}
    @Override
    String greeting(){return "大家好，我是老虎，請多多指教";}
    @Override
    public void skill(){System.out.println("這是Tiger類別的技能，狩獵...");}
    void casting(){   //方法
        System.out.println(name);
        System.out.println("1."+this.name);
        System.out.println("2."+super.name);
        System.out.println("3."+((Tiger)this).name);
        System.out.println("4."+((Cats)this).name);
        System.out.println("5."+this.greeting());
        System.out.println("6."+super.greeting());
        System.out.println("7."+((Tiger)this).greeting());
        System.out.println("8."+((Cats)this).greeting());
        }
    }
public class PolymorphismTest {
    public static void main(String[] args) {
    //exam1
//    Tiger t=new Tiger();
//    t.skill();     //這是Tiger類別的技能，狩獵...
//    t.move();      //這是Cats類別的移動，跑跑跳跳....
    
    //exam2
//    Cats c=new Tiger();
//    c.skill();      //這是Tiger類別的技能，狩獵...
//    c.move();       //這是Cats類別的移動，跑跑跳跳....
    
    //exam3
    Animal a =new Tiger();
    a.move();       //這是Cats類別的移動，跑跑跳跳....
    ((Tiger)a).skill();     //這是Tiger類別的技能，狩獵...
    ((Cats)a).skill();      //這是Tiger類別的技能，狩獵...
//    ((Birds)a).move();    //Tiger和Birds無繼承關係
    if (a instanceof Birds){      //用if, else判別Tiger和Birds有無繼承關係
        System.out.println("是繼承關係，可以轉型");
        ((Birds)a).move();
        }
    else
        System.out.println("不是繼承關係，不可以轉型");  //不是繼承關係，不可以轉型
    
//======多型與屬性之應用========
    //exam4
//    Cats c1=new Cats();
//    System.out.println(c1.greeting());
//    System.out.println(c1.name);
//    System.out.println(c1.getName());
    
    //exam5
//    Cats c2=new Tiger();
//    System.out.println(c2.greeting());
//    System.out.println(c2.name);
//    System.out.println(c2.getName());
//    new Tiger().casting();
    
    }
    
}

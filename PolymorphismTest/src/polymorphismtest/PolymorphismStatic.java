package polymorphismtest;
class Father{                    //類別
    static String name="爸爸";   //屬性
    static String greeting(){     //類別方法
        return "這是類別方法，大家好!我是爸爸";
        }
    String sayHello(){
        return "這是爸爸的物件方法";
        }
    }
class Son extends Father{
    static String name="兒子";
    static String greeting(){
        return "這是類別方法，大家好!我是兒子";
        }
    @Override
    String sayHello(){
    System.out.println(super.greeting());
    System.out.println(super.sayHello());
    return "這是兒子的物件方法";
    }
}

public class PolymorphismStatic {
    public static void main(String[] args) 
    {
    Son s=new Son();
    System.out.println(s.sayHello()); //這是類別方法，大家好!我是爸爸 //這是爸爸的物件方法  //這是兒子的物件方法
//    Father f=new Son();
//    System.out.println(f.name);
//    System.out.println(f.greeting());
//    System.out.println(f.sayHello());
    }
}

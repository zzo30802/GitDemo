package thirteenthcourse;
 class Father{    //建構子
    private int price;
    String name;
    //複寫方法
    public void showInfo(){   //如果改成public static void showInfo()的話，Son類別裡的也要改成這樣，不然會執行錯誤
    System.out.println("這是父類別的showInfo方法");
    }
    //設值方法
    public void setPrice(int price){
    this.price=price;
    }
    //取值方法
    public int getPrice(){
    return price;
    }
    }
    class Son extends Father{   //建構子
    String itemID;
    @Override   //複寫
    public void showInfo(){
    System.out.println("這是子類別的showInfo方法");//由子類別Son複寫父類別Father的showInfo
    super.showInfo();   //呼叫父類別的showInfo
        }
    } 

public class ThirteenthCourse {   
    public static void main(String[] args) { //程式進入點main撰寫
    Son s=new Son();
    s.setPrice(200);
    s.name="球鞋";
    s.itemID="A0001";
    System.out.printf("編號:%s,名稱:%s,價格:%d%n",s.itemID,s.name,s.getPrice());
    s.showInfo();
    new Son();  //Son()為建構子，能夠直接由實作物件呼叫出來，但是方法不行。
   
    
/*
繼承(inherit)
1.java為單一繼承(single inherit)，只能繼承一個類別。
2.父類別不能宣告為final
3.父類別稱為superclass或Baseclass(基礎類別)
  子類別抽為subclass  或extendsclass  (所有java用extends來繼承)
4.子類別可存取父類別之成員與方法
    但父類別無法存取子類別之成員
5.複寫(Override)是建構在繼承關係上，子類別為了改寫父類別之方法。    
*/

/*
複寫方法(Override)
1.複寫發生於繼承關係，子類別複寫父類別不適用之方法。        
2.若父類別之方法有加static關鍵字，則子類別則無法複寫。
  子類別之方法也可加上static關鍵字，但此為隱藏父類別之方法，無法加上 @Override註解
3.複寫注意事項: a.繼承關係
               b.子類別複寫方法之存取權限需大於或等於父類別。
               c.方法名稱要相同。
               d.若有回傳值，回傳值型態需相等或為子類別
               e.參數之數量、型別、位置順序皆需相同
*/    
    }
    
}

package fivteenthcousre;
class Animal{
void move(){
    System.out.println("動物移動方式");
    }
}
abstract class Birds extends Animal{
    @Override
    void move(){
    System.out.println("飛");
    }
    //宣告抽象方法
    abstract void hide();  //因為是抽象方法，所以不能有{}的實作內容
}
class Ostrich extends Birds{
    @Override
    void move(){
        System.out.println("這是駝鳥,用跑的");
        }
    void hide(){
        System.out.println("這是駝鳥心態,頭埋起來");
        }
    }
public class FivteenthCousre {
    public static void main(String[] args) {
    //第一次實作
    Ostrich o=new Ostrich();
    o.move();
    o.hide();
    //第二次實作，以鳥類的觀點看鴕鳥
    Birds b=new Ostrich();   //父->Birds   子->Ostrich  因此Birds不能使用Ostrich的方法，若父要使用子的方法需要"轉型"。
    b.move();
 // b.hide(); 
 //利用轉型的方法使用Ostrich的方法
    System.out.println("利用轉型的方法使用 Ostrich的方法");
    ((Ostrich)b).hide();  
    
    b.hide();   //這邊能夠執行成功，是因為birds抽象類別建立了hide()抽象方法，使父類別使用子類別方法。
    }
    
}
/*
Animal       <=  Birds        <= Ostrich
move():void      move():void     move():void
                                 hide():void


*多型(polymorphism)
1.建構在繼承關係中
2.所謂的多型即為=>一個實體 new xxx()可宣告為多種型別(父類別或本身)
3.官告知父類別之物件，參考可使用實體的資源，但方法需父、子皆有宣告才可呼叫子實體之方法。

*UML(統一塑模)

*Q:如何在父類別使用子類別方法?
 A:1.轉型
   2.抽象(abstract)
*/
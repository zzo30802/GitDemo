package twelfthcourse;

public class TwelfthCourse4 {
    int price;
    String goodsName;
    public TwelfthCourse4()   //無參數   //TwelfthCourse4是預設建構子
    {
    System.out.println("這是預設建構子");
    }
  //建構子多載，有參數列的建構子
    public TwelfthCourse4(String n,int p)   //有參數
    {
    System.out.println("這是有參數列的建構子");
    this.goodsName=n;
    this.price=p;
    String showInfo=String.format("產品名稱:%s,單價:%d元",this.goodsName,this.price);
    System.out.println(showInfo);
    }
    public static void main(String[] args) 
    {
    TwelfthCourse4 a=new TwelfthCourse4();  //呼叫預設建構子，run=>這是預設建構子
    TwelfthCourse4 b=new TwelfthCourse4("運動鞋",2000); //參數的設定順序必須跟建構子的()內一樣
    }    
}
/*Constructor 建構子
        1.建構子:目的在於建立物件時，即可設定物件數性
        2.建構子沒有回船型別(即沒有void或資料型別)
        3.建立新物件時，編譯器即會產生"預設建構子"
        4.預設建構子沒有任何參數，且只能有一個。
        ex:類別名稱 物件參考名稱=new 類別名稱()  ，其中"類別名稱{}"即為預設建構子
  建構子注意事項:
1.無撰寫任何建構子，編譯時即會自動產生預設建構子。
2.若有自行撰寫有參數之建構子時，須自行再撰寫預設建構子，因為編譯器不會自行產生，
  如此在建立物件時=> 類別名稱 物件=new 類別名稱();即會發生Compilation fails. 因為找不到預設建構子。
*/ 
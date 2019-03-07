package tenthcourse;
public class TenthCourse { //宣告類別
    public int w;
    protected int x;
    int y;
    private int z;
    /*
    public=>當類別宣告為public時，檔名需要與類別名稱相同
    protected和private=>內部類別才能使用
    static=>只能用在內部類別
    abstract=>抽象類別，用於interface(介面)
    final(當類別宣告為final，此類別不能被繼承extends)
    
    **non-static Method(物件方法)與static Method(類別方法)
        1.non-static方法可直接呼叫:a.物件方法(non-static)
                                  b.類別方法(static)
        2.static方法只能呼叫a.static方法
                           b.若要呼叫non-static方法需時作物件才可進行呼叫
    
    
    */ 
    public static void main(String[] args) {//程式進入點main    //有static就是類別方法
    //UML 存取權限符號 +public  -private  #protected  ~default
    //物件導向與研(OOP)
    //在此宣告的變數為區域變數
    TenthCourse ten=new TenthCourse();  //宣告實作物件
    ten.w=10;
    ten.x=20;
    ten.y=30;
    ten.z=40;
    //呼叫物件方法
    
    ten.doSomething();
    }
    public void doSomething()
        {//物件方法
        System.out.println("這是物件方法doSomething");
        System.out.printf("w=%d,x=%d,y=%d,z=%d",w,x,y,z);
        } 
    void aMethod()  //non-static方法
        {
        bMethod();
        cMethod();
        dMethod();
        }
    void bMethod()  //non-static方法
        {
        }
    static void cMethod()  //static方法，在static方法裡不能直接呼叫物件方法，必須通過實作物件才行。
        {
        dMethod();
    //  bMethod();  無法呼叫
        new TenthCourse().bMethod();//實作物件才可進行呼叫
        }
    static void dMethod()  //static方法
        {
        }
}
class TenthBrother{
    void aTest(){
    TenthCourse a=new TenthCourse();
    a.x=20; //只有z無法存取，因為其宣告為private
    }

}

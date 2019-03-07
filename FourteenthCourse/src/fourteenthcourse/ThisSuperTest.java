package fourteenthcourse;
class Father1{
    int money=1000000;  //class下為物件變數 方法內宣告的話就是區域變數。
    void property(){
        System.out.println("總公司的資產:");
        }
    }
class Son1 extends Father1{
    int money;        //屬性
    @Override
    void property(){   //方法
        System.out.println("子公司的資產:");
        }
    public Son1 (int money)
        {
        setMoney(money);
        }     
    public void setMoney(int money)
        {
        this.money=money;
        }
    public void showInfo()
        {
        property();
        System.out.println("總金額為"+money);
        super.property();
        System.out.println("總金額為"+super.money);
        }
    }
public class ThisSuperTest {
    public static void main(String[] args) 
    {
    new Son1 (800000).showInfo();

    }
}

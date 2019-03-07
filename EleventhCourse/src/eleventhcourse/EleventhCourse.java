package eleventhcourse;

import javax.swing.JOptionPane;

public class EleventhCourse {
    public static void main(String[] args) {
    /*
    *方法method
    1.宣告語法:存取權限修飾字  修飾語  回傳型態  方法名稱(參數)
       修飾語:加static為類別方法，否則為物件方法
       回傳型態:若為void則無回傳值，不需return，否則須加上return回傳。
     
    *封裝(Encapsulation)
       設值setXXX
       取值getXXX      
    */    
    Father f=new Father();  
    //f.quantity=20; //此行編譯錯誤，因為private無法呼叫quantity方法
    int price1=Integer.parseInt(JOptionPane.showInputDialog("請輸入單價"));
    int quantity1=Integer.parseInt(JOptionPane.showInputDialog("請輸入數量"));
    f.setPrice(price1);
    f.showTotal();
    System.out.printf("主程式內的單價:%d,數量:%d,總金額:%d%n",f.getPrice(),f.getQuantity(),f.getPrice()*f.getQuantity());
    }
    
}
class Father{  //宣告一個子類別
    private int quantity; //宣告物件
    private int price;    //宣告物件
    public void showTotal()  //宣告方法
        {
        System.out.printf("類別內的單價:%d,數量:%d,總金額:%d",quantity,price,price*quantity);  
        }
    //設值，可使外部呼叫private的物件變數    
    public void setQuantity(int quantity)  //宣告方法//外部如果要改變"物件變數quantity"的值，要用"方法setQuantity"呼叫。
        {
        this.quantity=quantity;
        }
    public void setPrice(int price)   //宣告方法
        {
        this.price=price;
        }
    public int getQuantity(){    //宣告方法，並回傳
        return this.quantity;
        }
    public int getPrice()
        {
        return price;
        }
    } 
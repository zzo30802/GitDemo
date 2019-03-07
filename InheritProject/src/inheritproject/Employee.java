package inheritproject;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Employee {
    NumberFormat formatter=NumberFormat.getCurrencyInstance();
    private static int nextId=101;  //編號++
    private int empId;             //編號
    private String name;        //名字
    private String ssn;      //身分證字號
    private double salary;   //薪水
    public Employee(){
        }
    public Employee(String name,String ssn,double salary){  //建構子
        this.empId=nextId++;
        this.name=name;
        this.ssn=ssn;
        this.salary=salary;
        }
    public void setName (String name){   //方法
        if(name==null || name.trim().length()<=0)  //name等於空白或 將姓名中空白刪除後字串長度小於等於0
        JOptionPane.showMessageDialog(null,"姓名顯示錯誤","輸入性名",JOptionPane.ERROR_MESSAGE);
        else
            this.name=name;
        }
    public void raiseSalary (double increase){
        if(increase>0)
            salary+=increase;
        else
            JOptionPane.showMessageDialog(null,"加薪需大於0元","沒誠意",JOptionPane.ERROR_MESSAGE);
        }
    public void displayInformation (){
        System.out.println("======員工資料======");
        System.out.println("員工編號:"+empId);
        System.out.println("員工姓名:"+name);
        System.out.println("身分證字號:"+ssn);
        System.out.println("員工薪資:"+NumberFormat.getCurrencyInstance().format(salary));
        }
    public static void main(String[] args) 
        {

        }
}

/*
*利用NumberFormat類別之getCurrencyInstance()方法取得本地化之貨幣符號
*setName方法內加上判斷
1.若name內為空字串(null)或有空白(neme.trim().length<=0)
則利用JOptionPane顯示錯誤("姓名輸入錯誤")

*setName 方法內加上判斷
1.若name為空字串(null)或有空白(name.trim().length<=0)則利用JOptionPane顯示錯誤("姓名輸入錯誤")

*raiseSalary方法內判斷
1.加薪需>0否則顯示錯誤

*showMessageDialog(1,2,3,4)
1=>父類別樣式,若無使用null
2=>訊息
3=>標題
4=>顯示之小圖示

*多型(polymorphism)
1.建構在繼承關係中
2.所謂的多型即為=>一個實體 new xxx()可宣告為多種型別(父類別或本身)
3.官告知父類別之物件，參考可使用實體的資源，但方法需父、子皆有宣告才可呼叫子實體之方法。
*/
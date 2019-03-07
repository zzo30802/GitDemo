package ninethcourse;
public class NinethCourse2 {
    public static void main(String[] args) 
    {
    //萬用字元　?:一個字  *:所有字元  ^:begin  $:end  \\s:空白  
    //contains(字串A):判斷字串中是否包含字串A，若有包含回傳true，否則false
    //startsWith(字串A)起始是否為字串A，是=>true，否=>false
    //endsWith(字串A)結束是否為   字串A，是=>true，否=>false
    //indexOf(字串A)回傳字串A首次出現之位置，若找不到回傳-1
    //lastIndexOf(字串A)回傳字串A最後一次出現之位置，若找不到回傳-1
    //replace(字串A,字串B)=>以字串B(new)取代字串A(old)
    //replaceAll(字串之正規表達式,字串B)
/*  String temp="pcschool hello java";
    System.out.println(temp.contains("ll"));   //true
    System.out.println(temp.startsWith("pcs"));//true
    System.out.println(temp.endsWith("java")); //true
    System.out.println(temp.indexOf("c"));     //1
    System.out.println(temp.lastIndexOf("l")); //12  */

/*  String temp=" pcschool hello java ";
    System.out.println("前"+temp+"後");
    System.out.println("前"+temp.replace(" ","")+"後");
    System.out.println("前"+temp.trim()+"後");    //trim()刪除前後空白   
    //刪除左邊空白
    System.out.println("前"+temp.replaceAll("^\\s","")+"後");
    //刪除右邊空白
    System.out.println("前"+temp.replaceAll("^\\s*$","")+"後");
    System.out.println(temp.isEmpty()); //false   判斷是否為空字串，是回傳true，否回傳false
    System.out.println(temp.length());  //21
    
//*****************************        
    //split(字元):以某個字元來分割字串，分割之結果為陣列型割，所以需以陣列來存放。
    String week="Sun,Mon,Tue,Wed,Thr,Fri,Sat";
    String []weekArray=week.split(",");
    for(String x:weekArray)  //用foreach印出所有陣列
        System.out.println(x+"\t");    */
 
//*********************************        
    //format():字串格式化輸出
    //控制輸出格式字元:
    //%md:整數,m:位元數,正:靠右對齊，負:靠左對齊   例int a=123;   %5d=  123;   %-5d=123   ;
    //%m.nf:浮點數,m:總位數(整數+小數點+小數),n:小數位數
    //%s:字串   %c:字元   %b:布林
    String name= "peschool";
    char sex='M';
    int age=30;
    double height=170.256;
    boolean flag=true;
    String temp=String.format("我的名字叫%s，性別為%c，年齡為%d，身高為%10.2f，婚姻狀況為%b%n",name,sex,age,height,flag);
    System.out.println(temp);
   
//***************************************  
    //StringBuilder類別  //StringBuilder不能使用concat()，concat()是String的方法。
    //1.其為mutable(可改變內容之類別)
    //2.常用語法 (1)append():新增字串
    //           (2)replace(begin,end,new string);   //end於計算時需要-1
    //           (3)delete(begin,end)
    //ps:StringBuilder並沒有+及concat之字串結合，編譯時會錯誤。
    StringBuilder sb=new StringBuilder("pcschool");
    sb.append("java").replace(2,5,"hello").delete(3,4);
    System.out.println(sb);
    
    
    }
}

package fourthcourse;

import java.util.Scanner;   //將java裡util類別的Scanner匯入

public class FourthCourse {   //classs
    public static void main(String[] args) {
    //三元運算子
    //****輸入一成績判定A,B,C分數區間(使用java.util.Scanner，須先匯入import java.util.Scanner;)
    Scanner sc=new Scanner(System.in);  //使用者輸入資料，也可以輸入java.util.Scanner sc=new Scanner(System.in); 
    System.out.println("請輸入成績:");
    int score=sc.nextInt();
    System.out.println(score>=90?"A":score>=60?"B":"C"); //第一格判斷如果為false，則會判斷第二格，已次類推(三元運算子)。
    
    //複合指令運算子
    int a=5;
    a=a*2+10;
    System.out.println(a);  //a=20
    int b=5;
    b*=2+10;  //b=5*(2+12)=60
    System.out.println(b);  //b=60
    
    //priority
    
    //Reference Type(三考資料型別):於stack Memory貯存的是物件存於heapMemory之參考位置。
    //litera(字面值)
    /*String s=new String("Hello");  //String(字串類別)為immutable不可改變的。須使用StringBuilder或StringBuffer類別
    String s1=new String("Hello");
    System.out.println("s==s1"+(s==s1));  //false，因為new的關係,資料在stackMemory的位置不一樣。
    String s2="java";
    String s3="java";
    System.out.println("s2==s3"+(s2==s3)); //true
    */
    
    //.concat(組合String)
 /* String s1=new String("Hello");
    s1.concat("java");
    System.out.println(s1); //顯示Hello
    String s2=new String("Hello");
    s2=s2.concat("java");
    System.out.println(s2);*/  //顯示Hellojava   
    
    //equals:判斷heapMemory內之字串內容是否相同，須使用equals()方法，若不區分大小寫則使用equalsIgnoreCase()
 /* String s1=new String("Hello");
    String s2=new String("Hello");
    System.out.println(s1.equals(s2));   //true
    String s3=new String("hello");
    System.out.println(s1.equals(s3));   //false
    System.out.println(s1.equalsIgnoreCase(s3));  //true
 */ 
    //constant(常數):一經宣告即不可改變其內容。
    final double PI=3.14159;  //在前面加上final的話，代表此變數為常數，不能夠更改。
   
      }
    void Orange(){}    //method
    public class Apple extends FourthCourse{  //class
        @Override   //複寫
        void Orange(){}
    
    
    }
    
}

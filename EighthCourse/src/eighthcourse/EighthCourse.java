package eighthcourse;

import java.util.Scanner;

public class EighthCourse {
    public static void main(String[] args) {
    //charAt(n) =>擷取字串中之字元，起始值從0開始，若n超過字串長度會出現值型錯誤Runtime Error)
/*  String a="hello";
    System.out.println(a.charAt(1));   //charAt()出來的值是字元，不是字串。
    }   */
    
/*  String b="1234";
    System.out.println(b.charAt(3)+10);  //會將字元4轉成ASCII值並作加法，結果為52+10=62   */
    
/*  String c="1234";
    System.out.println(String.valueOf(c.charAt(3))+10);  //使用String.valueOf()方法將字元轉成字串後，再做字串的組合  4+10=410   */

//*************************************************
    //next()不可接受空白。   nextLine()可接受空白。
/*  Scanner sc=new Scanner(System.in);
    System.out.print("請輸入任意英文字串");
    //String. s=sc.nextLine();
    String s=sc.next(); 
    System.out.println(s);  */

    
//toLowerCase()/toUpperCase()=>此方法可以使字串的英文大小寫轉換。
//isPalindrome()回傳
    Scanner sc=new Scanner(System.in);
    System.out.print("請輸入任意英文字串");
    String s=sc.next(); 
    s=s.toLowerCase();//全部轉成小寫
    System.out.printf("您輸入的字串:%s%s迴文%n",s,isPalindrome(s)?"是":"不是");   
    }
//判斷是否為迴文的方法,是回傳true ,不是回傳false
    public static boolean isPalindrome(String s){
       int low=0,high=s.length()-1;
       while(high>low){
           if(s.charAt(low) != s.charAt(high))
               return false;
           low++;
           high--;
       }
       return true;
    }
}

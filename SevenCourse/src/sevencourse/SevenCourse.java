package sevencourse;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SevenCourse {
    public static void main(String[] args) {
    //練習題:求階乘factorial
    //1.輸出:請輸入欲求之階乘
    //2.用for迴圈印出結果
/*  Scanner sc=new Scanner(System.in);
    System.out.println("請輸入欲求之階乘");
    int max=sc.nextInt();
    int sum=1;
    for(int m=max;m>=1;m--)
        {
        System.out.print(m);
        if(m !=1)
            {
            System.out.print("x");
            }
        sum*=m;    
        }
    System.out.print("="+sum+"\n");
    }    */
    
//************************************************
    //二維陣列
    //1.對稱型 int[][] score=new int[2][3];  (也可寫成int score[][]或int []score[])
    //2.非對稱 int[][] score=new int[2][];
    //                score[0]=new int[2];
    //                score[1]=new int[5];
    //印出非對稱之二維陣列內容(用for each)
/*  int[][]score=new int[2][];
    score[0]=new int[]{1,2};
    score[1]=new int[]{5,6,7,8,9};
        for(int[] x:score)
        {
        for(int y:x)
            System.out.print(y+"\t"); //印出每一列的內容
        System.out.println();
        }   */
    
//**************************************************    
    //圖形使用者輸入介面
    //1.利用JOptionPane類別的showInputDialog()之方法，輸入之回傳結果為String(字串)
/*  String temp=JOptionPane.showInputDialog("請輸入成績");
    System.out.println("您輸入的成績為:"+temp);  */
    
    //用Integer.parseInt包覆類別將String轉為Int
/*  int temp=Integer.parseInt(JOptionPane.showInputDialog("請輸入成績"));
    System.out.println("您輸入的成績為:"+temp);  */
    
//********************************************************
//練習題:利用二維陣列儲存成績單
//1.宣告 studentName[] 內容=>"張三","李四","王五"
//2.宣告 subjectTitle[] 內容=>"國文","英文"
//3.宣告 score[][]
//4.利用InputDialog輸入成績需將字串轉整數
//5.印出成績單
/*  String studentName[]=new String[]{"張三","李四","王五"};
    String subjectTitle[]=new String[]{"國文","英文"};
    //宣告二維陣列用來儲存成績
    int score[][]=new int[3][2];
    //利用巢狀迴圈及showInputDialog讓使用者輸入成績
    for(int m=0;m<studentName.length;m++)   //m=0,1,2  =>3個
    {
        for(int n=0;n<subjectTitle.length;n++)  //n=0,1  =>2個
        {
        score[m][n]=Integer.parseInt(JOptionPane.showInputDialog("請輸入"+studentName[m]+"的"+subjectTitle[n]+"成績"));
        }
    }
    //印出成績單內容
    //印出科目
    for(String x:subjectTitle)
        System.out.print("\t"+x);  //  \t:tab按一下    \t:跳到下一行
    System.out.println();//換行
    for(int m=0;m<studentName.length;m++)
        {
        System.out.print(studentName[m]+"\t");//印出同學姓名
        for(int n=0;n<subjectTitle.length;n++)
            System.out.print(score[m][n]+"\t");//印出各科成績
        System.out.println();//換行
        }     */
    
//******************************************************************************
    //設定範本
    //1.Tools->Templates->Java->點java class
    //2.點下方OpeninEditor鈕
    //3.可修改範本內容，上面四排刪掉，下方註解刪掉，以後開啟新的java class就會比較乾淨。
//******************************************************************************

    //String (immutable不可更改內容)
    //String s="hello";

}
    
    
    
}

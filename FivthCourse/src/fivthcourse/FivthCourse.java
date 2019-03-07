package fivthcourse;

import java.util.Scanner;

public class FivthCourse {
    public static void main(String[] args) {
    //switch (運算式)
    //1.運算式之型態小於int (例: byte, Byte, short, Short, char, int)
/*  Scanner sc=new Scanner(System.in);
    System.out.println("請輸入成績");
    int score=sc.nextInt();
    switch (score/10)
        {
        case 10:
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
      }
*/
    //**********************************
    //for (迴圈)
    //for (初始值;結束條件;增值){statement} break;中斷
/*   int x;
   for(x=1;x<=10;x++)
        {
        System.out.println(x);
        if(x==5)
            {
            break;
            }
      }
*/
/*  for(int x=1;x<=10;x++)
        {
        if(x==5)
            {
            continue;
            }
         System.out.println(x);
      }*/

//for 槽狀迴圈
/*  for(int m=1;m<=5;m++)
        {
        System.out.print("m="+m+"\t");   //print   println換行
        for(int p=1;p<=3;p++)
            {
            System.out.print("p="+p+"\t");
            }
        System.out.println();//此行是屬於外迴圈,用於換行用
        }
*/  
//印出下列圖形
//*
//**
//***
//****
//*****
/*  for(int x=1;x<=5;x++)
        {
        for(int y=1;y<=x;y++)
            System.out.print("*");
        System.out.println();
        }*/
    
//印金字塔
//1.輸入想要印的列數
    Scanner sc=new Scanner(System.in);
    System.out.println("輸入想要印的列數");
    int rowNumber=sc.nextInt();
    //外迴圈負責印列數
    for(int m=0;m<rowNumber;m++)
        {//每一列空幾格空格
        for(int p=0;p<rowNumber-m;p++)
            System.out.print(" ");
        //內迴圈負責每一列印幾顆星星
        for(int x=0;x<m*2+1;x++)
            System.out.print("*");
        System.out.println();
        }
    
    
    }
}

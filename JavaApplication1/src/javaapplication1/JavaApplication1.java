package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
//Course4-02
/*  boolean opt=true;
    switch (opt)  //switch(只能為整數或變數名稱)
        {
        case true:
            System.out.print("True");
            break;
        default:
            System.out.print("***");
        }
        System.out.println("Done"); */
//*********************************************************

//Course4-03
/*  int num=5;
    do  {
        System.out.print(num-- + " ");
        }while(num==0);   */
//*********************************************************           
    
//Course4-04
/*  int ii=0;
    int jj=7;
    for (ii=0;ii<jj-1;ii=ii+2)
        {
        System.out.print(ii + "　");
        }    */
    
//Course4-07
/*  for(int ii=0;ii<3;ii++){
        int count=0;
        for(int jj=3;jj>0;jj--){
            if(ii==jj){
                ++count;
                break;
                }
            }
        System.out.print(count);
        continue;
        }  */
    Scanner sc=new Scanner(System.in);
    System.out.println("請輸入想要印的列數");
    int x=sc.nextInt();
    //外圈負責的列數
    for (int m=0;m<x;m++)
        {
        for (int n=1;n<x-m;n++)
            System.out.print(" ");
        for (int o=0;o<2*m+1;o++)
            System.out.print("*");
        System.out.println();
        }

    }
    
}

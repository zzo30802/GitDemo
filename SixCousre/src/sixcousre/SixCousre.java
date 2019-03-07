package sixcousre;

import java.util.Scanner;

public class SixCousre {
 public static void main(String[] args){ /*
    System.out.println(Math.random());  //Math.random回傳的是double，0~0.9999999....
    System.out.println((int)(Math.random()*10)); //0~9
    System.out.println((int)(Math.random()*13)+1);//1~13
    System.out.println((char)((int)(Math.random()*26+65)));//ascii table:65~90==A~Z
*/

//前測
/*  int x=(int)(Math.random()*13)+1;
    while (x>7)
        {
        System.out.println("迴圈內x的值"+x);
        x=(int)(Math.random()*13)+1;
        }
    System.out.println("結束x的值"+x);
    } */

//後測
/*  int x=(int)(Math.random()*13)+1;
    do  {
        System.out.println("迴圈內x的值"+x);
        x=(int)(Math.random()*13)+1;
        }
    while (x>7);
    System.out.println("結束x的值"+x);
    } */

//費氏數列
/*  int no1=1,no2=1;
    int next=no1+no2;
    Scanner sc=new Scanner(System.in);
    System.out.println("請輸入最終數");
    int max=sc.nextInt();
    System.out.println(no1+"\t"+no2);
    while(next<max)
        {
        System.out.println("\t"+next);
        no1=no2;
        no2=next;
        next=no1+no2;
      }    */
    }
}
package fourthcourse;

import java.util.Scanner;

public class FourthCourse2 {
    public static void main(String args[]){
    //流程控制(if...else)
 /* boolean flag;
    if(flag=false)
      {
      System.out.println("真");
      }
    else
      {
      System.out.println("假");
      }
 */
//------------------------------------------------------------ 
    //流程控制(if...else if...else if...else)
/*  Scanner sc=new Scanner(System.in);
    System.out.println("請輸入成績:");
    int score=sc.nextInt();
    if(score>=90)
        {
        System.out.println("A");
        }
    else if(score>=80)
        {
        System.out.println("B");
        }
    else if(score>=70)
        {
        System.out.println("C");
        }
    else if(score>=60)
        {
        System.out.println("D");
        }
    else
        {
        System.out.println("E");
        }
*/  //-------------------------------------

    //switch(break和defult為可有可無(optional)，defult只能有一個可以出現在任何位置)
    Scanner sc=new Scanner(System.in);
    System.out.println("請輸入數字");
    int x=sc.nextInt();
    switch(x)
        {
        default:
            {
            System.out.println("default");
            }
        case 1:
            {
            System.out.println("one");
            break;
            }
        case 2:
            {
            System.out.println("two");
            break;
            }
        case 3:
            {
            System.out.println("three");
            break;
            }
           
        }
    }
}

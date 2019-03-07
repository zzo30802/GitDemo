package ninethcourse;

import javax.swing.JOptionPane;

public class NinethCourse {
    public static void main(String[] args) {
//練習題:猜數字遊戲
    //產生1-9四個不重覆的數字放入ans陣列內
    int [] ans=new int[4];
    int [] gus=new int[4];
    int a,b;
    String hintString="";
    //產生四個
    for(int m=0;m<4;m++)
    {
        ans[m]=(int)(Math.random()*9)+1;
    //判斷四個數字是否有重覆
    for(int n=0;n<m;n++)
    {
        if(ans[m]==ans[n])
            m--;
    }
    }
    for(int x:ans)
        System.out.print(x+"\t");
    System.out.println();
    do
    {
        a=0;b=0;
    //使用者輸入四個不重覆的數字,並存入gus陣內列
    String temp=JOptionPane.showInputDialog("請輸入1-9四個不重覆的數字");
    for(int s=0;s<4;s++)
        gus[s]=Integer.parseInt(temp.substring(s,s+1));
    //判斷幾A幾B
     for(int p=0;p<4;p++)   
     {
         for(int q=0;q<4;q++)
         {
             if(ans[p]==gus[q])
             {
                 if(p==q)
                     a++;
                 else
                     b++;
             }
         }
     }
      hintString+=temp+"==>"+a+"A"+b+"B"+"\n";
      JOptionPane.showMessageDialog(null,hintString);
    }while(a!=4);
    }
}
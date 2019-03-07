package eleventhcourse;

import java.util.Arrays;

public class MethodTest3 {
    public static void main(String[] args) 
        {
//      傳址呼叫(Call by address)  //call by address(陣列應用)
        int score[] = {60, 50, 100, 98, 70, 30};
        System.out.println("呼叫方法前之陣列內容為:");
        for (int x : score) {
            System.out.print(x + "\t");
        }
        System.out.println();
        sortArray(score);
        System.out.println("呼叫方法後之陣列內容為:");
        for (int x : score) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    public static void sortArray(int[] score) {
        System.out.println("方法內之陣列內容為:");
        for (int x : score) {
            System.out.print(x + "\t");
        }
        System.out.println();
        //陣列排序,由小到大　　//以下方法也可用 Arrays.sort(陣列名稱);代替
/*      for(int m=0;m<score.length-1;m++)
        {
            for(int n=m+1;n<score.length;n++)
            {
                if(score[m]>score[n])
                {
                    int temp;   //temp為一個暫時存放值的空間
                    temp=score[m];
                    score[m]=score[n];
                    score[n]=temp;
                }
            }
        }
 */ 
        Arrays.sort(score);
        
        System.out.println("方法內排序後之陣列內容為:");
        for (int x : score) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }
}


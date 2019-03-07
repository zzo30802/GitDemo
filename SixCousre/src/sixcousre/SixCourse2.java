package sixcousre;
public class SixCourse2 {
    public static void main(String[] args){
    //陣列與字串
    //1.陣列:一群相同資料型則之變數集合。
    //2.宣告陣列: 一維:資料型則[]陣列名稱=new 資料型則[n]; n=資料長度
    //ex:int []score=new int[5];或 int score[]=new int[5]; 意思是score變數的陣列有5格
/*  int score[]=new int[5];
    for(int m=0;m<score.length;m++)
        {
        System.out.println("score["+m+"]="+score[m]);
        } */
    

    //陣列迴圈(for each) 語法 for(資料型則 變數:陣列名稱)
/*  int score[]=new int[5];
    int m=0;
    for(int x:score)
        {
        System.out.println("score["+m+"]="+x);
        m++;
        }  */
    
    //宣告陣列並指定出初值
//  int score[]={10,88,99,100,120};  //=int score[]=new int[]{10,88,99,100,120};
//  System.out.println(score);
    
    //二維陣列
    //1.對稱型=>int[][]score=new int[3][4];  3->列  5->欄
    //          score[0]=0,0  0,1  0,2  0,3
    //          score[1]=1,0  1,1  1,2  1,3
    //          score[2]=2,0  2,1  2,2  2,3
    //2.非對稱型=>int[][]score=new int[3][];
    //            score[0]=new int[2];  score[0]=0.0  0,1
    //            score[1]=new int[1];  score[1]=1,0
    //            score[2]=new int[4];  score[2]=2,0  2,1  2,2  2,3
    
    //對稱型(陣列中有陣列，並且印出長度)
/*  int[][]score={{1,2,3,4},{5,6,7,8}};
    System.out.println("1:"+score.length);     //2，看整個score的列數
    System.out.println("2:"+score[0].length);  //4，單看1,2,3,4的長度
    System.out.println("3:"+score[1].length);  //4，單看5,6,7,8的長度
*/ 

    //印出陣列
    int[][]score={{1,2,3,4},{5,6,7,8}};
    for(int m=0;m<score.length;m++)
        {
        for(int n=0;n<score[m].length;n++)
            {
            System.out.print(score[m][n]+"\t");
            }
        System.out.println();
        }
    
    //用foreach印出二維陣列
    for(int[] x:score)
        {
        for(int y:x)
            System.out.print(y+"\t");
        System.out.println();
        }
    
    
    }
}

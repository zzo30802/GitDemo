package eleventhcourse;
public class MethodTest {
    public static void main(String[] args) 
    {
/*        
    int sum=0;
    for(int m=1;m<=50;m++)
        sum+=m;
    System.out.println("1+2+3+...+50="+sum);
    //===========================================
    int sum1=0;
    for(int m=1;m<=100;m++)
        sum1+=m;
    System.out.println("1+2+3+...+100="+sum1);
*/    
    //將上列程式改以呼叫方法方式來計算加總
    System.out.println("1+2+...+50="+total(50));
    System.out.println("1+2+...+100="+total(100));
    System.out.println("1+2+...+200="+total(200));

    }
    //計算總合之方法
    public static int total(int max){
        int sum=0;
        for(int m=1;m<=max;m++)
        sum+=m;
        return sum;
    }
}
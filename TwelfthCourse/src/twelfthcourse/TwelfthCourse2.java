package twelfthcourse;
public class TwelfthCourse2 {
    public static void main(String[] args) 
    {
//方法多載(Overloading) (void,int有無回傳值視為一樣)
    System.out.println("整數+整數"+total(10,20));
    System.out.println("整數+浮點數"+total(10,20.5));
    System.out.println("整數+浮點數位置不同"+total(20.5,10));
    System.out.println("整數+整數+整數.數量不同"+total(10,20,30));        
    }
    public static int total(int a,int b)
    {
        return a+b;
    }
    public static int total(int a,int b,int c)  //把int改成void的話，會使答案無法回傳到main裡
    {
        return a+b+c;
    }
     public static double total(int a,double b)
    {
        return a+b;
    }
     public static double total(double b,int a)
    {
        return a+b;
    }
}

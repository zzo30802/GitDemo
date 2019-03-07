package twelfthcourse;
public class TwelfthCourse {
    public static void main(String[] args) {
/*
primitive基本資料型則
    1.整數=>byte short int long
    2.浮點數=>float double
    3.布林=>boolean
    4.字元=>char
reference參考資料型則            
*/
String a=new String("hello");
    System.out.println("呼叫方法前的a為"+a);
    sayHello(a);
    System.out.println("呼叫方法後的a為"+a);
        }
    public static void sayHello(String a)
    {
        System.out.println("方法內運算前的a為"+a);
        a=a+" java";
        System.out.println("方法內運算後的a為"+a);
    }
}
    


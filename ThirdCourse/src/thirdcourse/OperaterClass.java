package thirdcourse;
public class OperaterClass {
    public static void main(String args[])
    {
    //算數運算子
     System.out.println(10/3f);
     System.out.println(10%3);
     System.out.println("這是"+2+3);
     System.out.println("這是"+(2+3));
     //遞增/減運算子
     int x=10;
     System.out.println(x++);
     System.out.println(x);
     int c=0,a=5;
     c=++a+a++ + ++a;
     System.out.println("c="+c);
     System.out.println(10>3 & 10>5); // 1 1 and=1
     System.out.println(10>3 & 10<5); // 1 0 and=0
     System.out.println(10>3 | 10>5);
     System.out.println(10>3 ^ 10>5);
     System.out.println(10>3 ^ 10<5);
     a=10;
     System.out.println(10>3 & a++>5);
     System.out.println(a);
     System.out.println(10<3 && a++>5); //&&會先判斷前眠的判斷式，如果違false，後面就不會運算
     System.out.println(a);
     System.out.println(10>3?"真":"假");
     System.out.println(10<3?"真":"假");
    }
}

package eleventhcourse;
public class MethodTest4 {
    public static void main(String[] args) 
    {
    //call by address(物件應用)    
    Rectangle rec=new Rectangle();
    System.out.printf("呼叫方法前物件屬性寬為%d,高為%d%n",rec.w,rec.h);
    changObj(rec);
    System.out.printf("呼叫方法後物件屬性寬為%d,高為%d%n",rec.w,rec.h);
    }
public static void changObj(Rectangle rec)
    {
    rec.h=5;
    rec.w=8;
    System.out.printf("方法內設定物件屬性寬為%d,高為%d%n",rec.w,rec.h);
    }
}

class Rectangle{
    int h,w;
}


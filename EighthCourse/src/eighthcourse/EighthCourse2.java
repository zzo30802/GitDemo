package eighthcourse;
public class EighthCourse2 {
    public static void main(String[] args)  
    {
//compareTo()=>比較二字串是否相同，若相同則回傳0，若不相同則回傳第一個不同字元之ASCII差值。
//若字元皆相同，字數不同則回傳相差多少字。
/*  String s1="Java";
    String s2="Java";  
    String s3="JAva";
    String s4="Java hello!";
    System.out.println(s1.compareTo(s2));   //0  字全相同
    System.out.println(s1.compareTo(s3));   //32 a-A=>97-65=32
    System.out.println(s1.compareTo(s4));   //-7 少7個字   */
        
//substring(begin)擷取begin以後之所有字串
//substring(begin,end-1)擷取begin到end-1間之字串
//ps: 1.substring擷取之資料為String類別不能直接指定給StringBuilder或StringBuffer
//    2.索引值不能超過字串長度，同charAt()會出現錯誤。
//    3.begin不能大於end，否則會出錯。
String s1=new String("pcschool");
StringBuilder sb=new StringBuilder("pcschool"); //StringBuilder沒有concat()功能
//sb=s1.substring(5);//此行編譯錯誤，因字無法存入StringBulider容器內
//上一行可改成sb=new StringBuilder(s1.substring(5));        ????????????????????????
System.out.println(s1.substring(4));
   
    }
}

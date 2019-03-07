package twelfthcourse;
public class TwelfthCourse3 {
    public static void main(String[] args) 
    {
//變動參數
    System.out.println("呼叫變動參數");
    sumTotal(1,2,3,4,5);  //試著更改引述的數量
    }
    public static void sumTotal(int...num)  //num此為陣列資料型別  //.=>所在位置  ..=>回上一個資料夾
    {
    int sum=0;
    for(int x:num)
        sum+=x;
    System.out.println("加總為:"+sum);
    }
}


package eleventhcourse;
public class MethodTest2 {
    public static void main(String[] args) 
    {
/*  方法傳遞引數的方式
        1.傳值呼叫(Call by value)=>直接傳遞內容給參數，一班基本資料型別(整數,浮點數,字元,布林)皆為傳值呼叫。
        2.傳址呼叫(Call by address)或稱為 參考呼叫(Call by reference)=>傳遞的是記憶性的參考位址，而不是內容。如陣列,物件。
*/
//     傳值呼叫(Call by value)
        int m=1;
        System.out.println("呼叫方法前m="+m);
        changeValue(m);                     //呼叫方法
        System.out.println("呼叫方法後m="+m);
        }
    public static void changeValue(int m)   //宣告方法
        {
        System.out.println("方法內的m="+m);
        m+=5;
        System.out.println("方法內運算後m="+m);
        }

//===========================================================

        
        
    }   



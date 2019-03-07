package neighborhood;
import tenthcourse.TenthCourse;
public class SonCourse extends TenthCourse {
    public static void main(String[] args) 
    {
    SonCourse b=new SonCourse();
    b.w=50; //因為w在TenthCourse裡面是public，故可呼叫。但物件變數之間並不互相影響，如果是宣告static的變數才會共同維護。
    }
}
class SomeOne{
    void cTest(){
    TenthCourse c=new TenthCourse();
    c.w=50;
    }


}
/*封裝(encapsulation)=>為了保有物件之完整性及方便維護。不讓外界直接存取物件成員，故將成員設定為private
(但需供相關之介面或方法來存取成員)
ex:設值setXXX()與取值getXXX()之方法
*/
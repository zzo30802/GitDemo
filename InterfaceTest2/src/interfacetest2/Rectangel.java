package interfacetest2;
public class Rectangel implements Shape {
   double length,width;
   //設定長度的方法
   public void setLength(double length)
   {
       this.length=length;
   }
   public double getLength(){
       return this.length;
   }
   //設定寬度的方法
   public void setWidth(double width)
   {
       this.width=width;
   }
   public double getWidth(){
       return this.width;
   }

    @Override
    public double area() {
        System.out.println("長方形的面積:");
        return width*length;
    }

    @Override
    public double perimeter() {
        System.out.println("長方形的周長:");
        return 2*(length+width);
    }
    
}

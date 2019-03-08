package interfacetest2;
public class InterfaceTest2 {
    public static void main(String[] args) {
    Circle c=new Circle();
    c.setRadius(6.6);
    System.out.printf("半徑為:%.2f 的圓，面積為：%.2f，周長為：%.2f %n",c.getRadius(),c.area(),c.perimeter());
    }
    
}

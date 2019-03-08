package interfacetest2;
public class Circle implements Shape{
    private double radius;
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public double area() {
        return radius*radius*PI;
    }

    @Override
    public double perimeter() {
        return 2*radius*PI;
    }
}

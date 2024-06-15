package Chapter4;

public class Circle extends Shape implements Cloneable{
    private double radius;
    Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    public Point getCenter(){
        return point;
    }
    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}

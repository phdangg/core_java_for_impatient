package Chapter4;

public abstract class Shape {
    Point point;
    Shape(){}
    Shape(Point p){
        this.point = p;
    }
    public void moveBy(double dx, double dy){
        this.point.x += dx;
        this.point.y += dy;
    }
    public abstract Point getCenter();
}

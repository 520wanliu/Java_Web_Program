package part3.demo5;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
//        color = "white";
//        weight = 1.0;
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,double weight){
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea9(){
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Circle circle = (Circle) obj;
//        return Double.compare(circle.radius, radius) == 0;
        if (obj instanceof Circle){
            Circle circle = (Circle) obj;
            return this.radius == circle.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +"radius=" + radius +'}';
    }
}

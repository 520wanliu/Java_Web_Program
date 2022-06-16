package part5.demo2;
/*
   定义一个Circle类，声明radius属性，提供getter和setter方法
 */
public class Circle {
//    private double radius;
    private Double radius;  //此时属性声明为包装类Double

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
}

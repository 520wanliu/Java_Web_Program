package part3.demo2;

public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle(2,"white",2.0);
        test.displayGeometricObject(c1);

        Circle c2 = new Circle(3,"white",2.0);
        test.displayGeometricObject(c2);

        System.out.println("c1和c2的面积是否相等？" + test.equalsArea(c1,c2));
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){  //测试两个对象的面积是否相等
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o){  //显示对象的面积
        System.out.println("面积为："+ o.findArea());
    }
}

class GeometricObject{  //几何图形
    protected String color;
    protected double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public GeometricObject(String color,double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle(String color, double weight,double width,double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double findArea() {
        return width * height;
    }
}
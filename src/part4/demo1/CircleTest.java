package part4.demo1;
/*
* static关键字的应用
*/
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3);

        System.out.println("c1的id是：" + c1.getId());
        System.out.println("c2的id是：" + c2.getId());
        System.out.println("c3的id是：" + c3.getId());

        System.out.println("圆的个数有：" + Circle.getTotal());
    }
}

class Circle{
    private double radius;
    private int id;  //自动赋值

    private static int total;  //记录圆的个数
    private static int init = 1001; //

    public Circle() {  //参数的自动赋值
        id = init ++;
        total ++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
//        id = init ++;
//        total ++;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}

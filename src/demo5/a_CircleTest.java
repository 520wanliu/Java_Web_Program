package demo5;
/*
* 利用面向对象的编程方法，设计类Circle，计算圆的面积
* */
public class a_CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
//        c1.radius = 2;
//        double area = c1.FindArea();
//        System.out.println(area);
         c1.Findarea(2.5);
    }
}

class Circle{
//    double radius;
    //求圆面积
    /*public double FindArea(){
        double area = Math.PI * radius * radius;
        return area;
    }*/
    public  void Findarea(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("半径为" + radius + "的面积为："+ area);
    }
}

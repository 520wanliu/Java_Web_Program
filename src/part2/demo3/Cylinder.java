package part2.demo3;

public class Cylinder extends Circle{
    private double length;  //圆柱的高

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume(){
//        return Math.PI * getRadius() * getRadius() * length;
        return findArea() * length;
    }
}

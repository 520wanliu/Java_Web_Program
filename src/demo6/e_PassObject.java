package demo6;

import javafx.scene.shape.Circle;

/*
* 定义一个类PassObject，在类中定义一个方法printAreas()
* 该方法的定义如下： public void printAreas(Circle c,int time)
* 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积
* 例如：times为5，则输出半径1，2，3，4，5，以及对应的面积
*
* 在main方法中调用printAreas()方法，调用完毕后输出当前半径值
*
*
* */
public class e_PassObject {
    public static void main(String[] args) {
        e_PassObject test = new e_PassObject();
        e_Circle c = new e_Circle();
        test.printAreas(c,5);
    }
    public void printAreas(e_Circle c,int time){
        System.out.println("Radius\t\tArea");

        //设置圆的半径
        for (int i = 1;i <= time; i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
    }
}

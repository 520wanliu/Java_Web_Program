package demo1;

import java.util.Scanner;

public class f1_DogAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入狗狗的年龄：");
        double age = scanner.nextDouble();
        if (age >= 0 && age <= 2){
            age *= 10.5;
            System.out.println("狗的年龄等同于人的年龄为："+age);
        }
        else if (age > 2){
            age = 2 * 10.5 + (age - 2) * 4;
            System.out.println("狗的年龄等同于人的年龄为："+age);
        }
        else {
            System.out.println("输入错误");
        }
    }
}

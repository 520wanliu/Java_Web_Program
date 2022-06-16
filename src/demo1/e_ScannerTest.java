package demo1;
import java.util.Scanner;

/*
如何从键盘获取数据：使用Scanner类

具体实现步骤：
1、导包：import java.util.Scanner
2、Scanner实例化: Scanner scan = new Scanner(System.in);
3、调用Scanner类的相关方法，来获取指定类型的变量

注意：需要根据相应的方法，来输入指定类型的值，如果输入的类型与要求的类型不匹配时，
     会报异常：InputMisMatchException，导致程序终止

 */
public class e_ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();//获取int类型数据
//        System.out.println(num);
        System.out.print("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.print("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.print("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.print("你对我是否有想法？（true / false）");
        boolean islove = scan.hasNextBoolean();
        System.out.println(islove);

        //对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：（男 / 女）");
        String gender = scan.next(); //"男"
        char genderChar = gender.charAt(0);//获取索引为0位置上的字符
        System.out.println(genderChar);
    }
}

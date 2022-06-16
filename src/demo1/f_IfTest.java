package demo1;

import java.util.Scanner;

public class f_IfTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scanner.nextInt();

        int min ;
        if (num1 <= num2 && num1 <= num3)
            min = num1;
        else if (num2 <= num1 && num2 <= num3)
            min = num2;
        else min = num3;
        System.out.println("最小值为："+min);
        System.out.println("三个整数分别为："+(num1 + " " + num2 + " " + num3));
    }

}

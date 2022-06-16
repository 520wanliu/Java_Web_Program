package demo1;

/*
说明：
1、不在循环条件部分闲置次数的结构：for(;;)或while(true)
2、循环结束方式：
    方式一：循环条件部分返回false
    方式二：在循环体中，执行break
 */

import java.util.Scanner;

public class h_ForCircle {
    public static void main(String[] args) {

        /*
        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'),num++)
            System.out.print('b');
        */

        /*
        //遍历100以内的偶数
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i ++){
            if (i % 2 == 0){
                sum += i;
                count ++;
                System.out.println("100以内的偶数为："+ i);
            }
        }
        System.out.println("100以内偶数总和为：" + sum);
        System.out.println("100以内偶数个数为：" + count);
    */


//     编写程序从1到150，并在每行打印一个值
//     另外在每个3的倍数行上打印出foo；
//     在每个5的倍数行上打印biz；
//     在每个7的倍数行上打印输出baz

        /*
//     输入两个正整数m和n，求其最大公约数和最小公倍数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个正整数：");
        int m = scanner.nextInt();
        System.out.print("请输入第二个正整数：");
        int n = scanner.nextInt();

        //获取最大公约数
        //比较两个数中的较小值
        int min = (m <= n) ? m : n;
        //遍历
        for (int i = min; i >= 1; i--){
            if (m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                break;
            }
        }

        //获取最小公倍数
        //比较两个数中的较大值
        int max = (m >= n) ? m : n;
        //遍历
        for (int i = max; i <= m * n; i ++){
            if (i % m == 0 && i % n == 0){
                System.out.println("最小公倍数为：" + i);
                break;
            }
        }*/

        /*
        //输出所有的水仙花数：各个位上数字立方和等于其本身
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个三位数：");
//        int number = scanner.nextInt();
        int count = 0;

        for (int i = 100; i <= 999; i++ ) {

            int m = i / 100;
            int n = i % 100 / 10;
            int p = i % 10;

            if (i == m * m * m + n * n * n + p * p * p) {
                count++;
                System.out.println("100~999以内是水仙花数的是：" + i);
            }
        }
        System.out.println("100~999内共有"+ count +"个水仙花数");
        */


        //从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
        Scanner scanner = new Scanner(System.in);
        System.out.println("请随机输入整数：");
        int PositiveNum = 0;
        int NegativeNum = 0;
        while (true){
            int num = scanner.nextInt();
            if (num > 0){
                PositiveNum ++;
            }else if (num < 0){
                NegativeNum ++;
            }else {
                break;//System.out.println("程序结束");
            }
        }
        System.out.println("读入的数中正数个数为：" + PositiveNum );
        System.out.println("读入的数中负数个数为：" + NegativeNum );
    }
}

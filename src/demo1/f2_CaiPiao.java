package demo1;

/*
随机生成两位数的彩票，提示用户输入一个两位数，按照下面规则判定用户是否能赢
1.若用户输入的数匹配彩票的实际顺序，奖金10000美元；
2.若用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3000美元；
3.若用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000美元；
4.若用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元；
5.若用户输入的数字没有匹配任何一个数字，则彩票作废。
 */

import java.util.Scanner;

public class f2_CaiPiao {
    public static void main(String[] args){
        //[0.0 , 1.0) ---> [10.0 , 100.0)
        //生成随机数[a,b]：(int)(Math.random() * (b - a + 1) + a)
        int number = (int)(Math.random() * 90 + 10);
        System.out.println(number);

        int numbershi = number / 10;
        int numberge = number % 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的两位彩票号码：");
        int num = scanner.nextInt();

        int numshi = num / 10;
        int numge = num % 10;

        if (num == number) {
            System.out.println("奖金10000美元");
        }
        else if (numshi == numberge && numge == numbershi) {
            System.out.println("奖金3000美元");
        }
        else if (numshi == numbershi || numge == numberge){
            System.out.println("奖金1000美元");
        }
        else if (numshi == numberge || numge == numbershi){
            System.out.println("奖金500美元");
        }
        else System.out.println("彩票作废！");

        System.out.println("中奖号码是："+num);
    }
}


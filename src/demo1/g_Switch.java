package demo1;

import java.util.Scanner;

public class g_Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        /*System.out.println("请输入季节：");
        String season = scanner.next();
        switch (season){
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "sinter":
                System.out.println("白雪皑皑");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }*/
        /*
        System.out.println("请输入前五个小写字母：");
        String word = scanner.next();
        //从键盘获取char类型数据
        char c = word.charAt(0);
        switch (c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("输入错误！");
                break;
        }*/
        /*
        //成绩小于60为不及格，否则为及格
        System.out.println("请输入考试成绩：");
        int score = scanner.nextInt();
        switch (score / 10){
            //若switch-case结构中的多个case语句相同，则可以考虑结合
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("输入错误");
                break;
        }*/

        /*
        //从键盘上输入2019年的“month”和“day”，
        // 要求通过程序输出输入的日期为2019年的第几天
        System.out.println("请输入2019年的month：");
        int month = scanner.nextInt();
        System.out.println("请输入2019年的day：");
        int day = scanner.nextInt();

        int sumday = 0;
        if (day > 0 && day <= 31){
            switch (month){
                case 12:
                    sumday += 30;
                case 11:
                    sumday += 31;
                case 10:
                    sumday += 30;
                case 9:
                    sumday += 31;
                case 8:
                    sumday += 31;
                case 7:
                    sumday += 30;
                case 6:
                    sumday += 31;
                case 5:
                    sumday += 30;
                case 4:
                    sumday += 31;
                case 3:
                    sumday += 28;
                case 2:
                    sumday += 31;
                case 1:
                    sumday += day;
            }
            System.out.println("2019年" + month + "月" + day +"日是当年的第" + sumday + "天");
        }
        else System.out.println("输入日期超出范围！");
    }*/
/*
    //从键盘输入年、月、日，判断这一天是当年的第几天
    //判断一年是否是闰年的标准：1.可被4整除，但不可被100整除；2.可以被400整除
        System.out.println("请输入year：");
        int year = scanner.nextInt();
        System.out.println("请输入month：");
        int month = scanner.nextInt();
        System.out.println("请输入day：");
        int day = scanner.nextInt();

        int sumday = 0;
        if (day > 0 && day <= 31){
            switch (month){
                case 12:
                    sumday += 30;
                case 11:
                    sumday += 31;
                case 10:
                    sumday += 30;
                case 9:
                    sumday += 31;
                case 8:
                    sumday += 31;
                case 7:
                    sumday += 30;
                case 6:
                    sumday += 31;
                case 5:
                    sumday += 30;
                case 4:
                    sumday += 31;
                case 3:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                        sumday += 29;
                    }
                    else sumday += 28;
                case 2:
                    sumday += 31;
                case 1:
                    sumday += day;
            }
            System.out.println(year+ "年" + month + "月" + day +"日是当年的第" + sumday + "天");
        }
        else System.out.println("输入日期超出范围！");*/
    }

}

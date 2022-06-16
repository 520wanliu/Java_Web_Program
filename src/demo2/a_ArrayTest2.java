package demo2;

import java.util.Scanner;

public class a_ArrayTest2 {
    public static void main(String[] args) {
        /*
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for (int i = 0; i < index.length; i++){
            tel += arr[index[i]];
        }
        System.out.println("联系方式为："+ tel);
        */

        int arr1[] = {1,2,3,4,5};
        for (int i = 0; i < arr1.length; i ++){
            System.out.println(arr1[i]);
        }

/*
        //从键盘读入学生成绩，找出最高分，并输出学生成绩等级
        //1.读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请确认学生个数：");
        int count = scanner.nextInt();
        //2.创建数组，存储学生成绩，动态初始化
        int[] score = new int[count];
        //3.给数组中的元素赋值
        System.out.println("请输入"+count+"个学生成绩：");
        for (int i = 0; i < score.length; i++){
            score[i] = scanner.nextInt();
        }
        //4.获取数组中元素的最大值：最高分
        int maxscore = 0;
        for (int i = 0; i < score.length; i++){
            if (score[i] > maxscore){
                maxscore = score[i];
            }
        }
        System.out.println("最高成绩为：" + maxscore);

        //遍历数组给元素赋值，判断得出最大值（最高分）
        int maxScore = 0;
        System.out.println("请输入"+ count+"个学生成绩：");
        for (int i = 0; i < score.length; i++){
            score[i] = scanner.nextInt();
            if (score[i] > maxScore){
                maxScore = score[i];
            }
        }
        System.out.println(count + "个学生中最高成绩为：" + maxScore);
        //5.根据学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i = 0; i < score.length; i++){
            if (maxScore - score[i] < 10){
                level = 'A';
            }else if (maxScore - score[i] < 20){
                level = 'B';
            }else if (maxScore - score[i] < 30){
                level = 'C';
            }else level = 'D';
            System.out.println("student"+ i + " score is" + score[i] +
                    ",grade is" + level);
        }
 */
    }
}

package demo1;
/*
break 和 continue的使用：
           使用范围           循环中使用的作用（不同点）    相同点
break：    switch-case语句      结束当前循环           关键字后面不能声明执行语句
           循环结构

continue：  循环结构             结束当次循环           关键字后面不能声明执行语句
 */
public class i_QianTaoCircle {
    public static void main(String[] args){
        /*
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++){
                System.out.print('*');
            }
            System.out.println();
        }*/
        /*
        for (int i = 0; i <= 4; i++){
            for (int j = 1; j <= i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 3; i++){
            for (int j = 1; j <= 4 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < i + 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < 4 - i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*
        //九九乘法表
        for (int i = 1; i <= 9; i ++){
            for (int j = 1; j <= i; j++){
                System.out.print( j + " * " + i + " = " + (i * j) + "   ");
            }
            System.out.println();
        }*/

        /*
        //100以内的质数
        //判断不是质数：从2~n-1都不能被本身整除
        //boolean flag = true;
        for (int i = 2; i <= 100; i++){
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++){
                if (i % j == 0){//判断是否被整除，若整除则不是质数
                    flag = false;
                }
            }
            if (flag == true){
                System.out.println(i);
            }
            //flag = true;//重置flag，重新判断
        }*/

        /*
        //100000以内的质数
        //判断不是质数：从2~n-1都不能被本身整除
        //boolean flag = true;
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        boolean flag = true;
        int count = 0;
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++){
            //优化二：对本身是质数的自然数有效
            //for (int j = 2; j <= i - 1; j++)
            for (int j = 2; j <= Math.sqrt(i); j++){//
                if (i % j == 0){//判断是否被整除，若整除则不是质数
                    flag = false;
                    break;//优化一：只对本身是非质数的自然数有效
                }
            }
            if (flag == true){
                count ++;
                System.out.println(i);
            }
            flag = true;//重置flag，重新判断
        }
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为："+(end - start));//24031ms
        //优化一：3014ms    优化二：214ms
         */

        lable:for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                if (j % 4 == 0){
                    //break;//默认跳出包裹此关键字最近的一层循环
                    //continue;
                    //break lable; //结束指定标识的一层循环结构
                    continue lable; //结束指定标识的一层循环结构当次循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package demo2;
/*
算法考察：求数值型数组中元素的最大值、最小值、平均数、总和等

定义一个int型的一维数组，包含10个元素分别赋一些随机整数，
然后求所有元素的最大值、最小值、平均值和总和，并输出，
要求：所有随机数都是整数

随机值获取：[10,99]
公式：int(Math.random() * (99 - 10 + 1) + 10)
 */
public class c2_ShuZhiXingFuZhi {
    public static void main(String[] args) {
        int arr[] = new int[10];
        //获取随机值
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }
        //遍历输出数组
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //最大值
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxvalue < arr[i]){
                maxvalue = arr[i];
            }
        }
        System.out.println("最大值为：" + maxvalue);
        //最小值
        int minvalue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (minvalue > arr[i]){
                minvalue = arr[i];
            }
        }
        System.out.println("最小值为：" + minvalue);
        //总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);
        //平均值
        float avgvlue = sum / arr.length;
        System.out.println("平均值为：" + avgvlue);
    }
}

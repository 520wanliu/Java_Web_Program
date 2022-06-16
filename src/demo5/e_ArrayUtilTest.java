package demo5;

public class e_ArrayUtilTest {
    public static void main(String[] args) {
        e_ArrayUtil util = new e_ArrayUtil();
        int arr[] = {32,34,23,5,43,65,76,98,56,73,-45};
        int max = util.getMax(arr);
        System.out.println("数组中最大值为："+max);
        int min = util.getMin(arr);
        System.out.println("数组中最小值为："+min);
        int sum = util.getSum(arr);
        System.out.println("数组元素平均值为："+sum);
        int avg = util.getAvg(arr);
        System.out.println("数组元素平均值为："+avg);
        util.print(arr);
        util.reverse(arr);//数组反转
        util.print(arr);

        System.out.println("数组排序前：");
        util.print(arr);

        util.sort(arr);//数组排序
        System.out.println("数组排序后：");
        util.print(arr);
/*
        int index = util.getIndex(arr,43);
        if (index > 0){
            System.out.println("这是你要找的数据，索引位置为："+index);
        }else {
            System.out.println("抱歉，没找到！");
        }*/
    }
}

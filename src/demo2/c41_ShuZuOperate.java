package demo2;

import java.util.Scanner;

/*
数组操作：数组复制、反转、查找
 */
public class c41_ShuZuOperate {
    public static void main(String[] args) {
        String arr[] = new String[]{"GG","DD","MM","BB","JJ","AA"};
       /*
        //数组复制
        String arr1[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        //遍历输出复制数组
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        //数组反转①
//        for (int i = 0; i < arr.length / 2; i++){
//            String temp = arr[i];
//            arr[i] = arr[arr.length-1 - i];
//            arr[arr.length-1 - i] = temp;
//        }
        //数组反转②
        for (int i = 0,j = arr.length - 1; i < j; i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //遍历输出原始数组
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
*//*
        //数组查找
        //线性查找
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的元素：");
        String des = scanner.next();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            if (des.equals(arr[i])){  //字符串判断是否相等
                System.out.println("这是你要找的第" + i +"位的数："+ arr[i]);
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("很遗憾，没有找到你要找的元素！");
*/
        //二分法查找：前提是数组元素有序
        int arr2[] = {-93,-45,-19,29,39,56,89,98,203};
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入你要找的数：");
        int num = scanner1.nextInt();
        int left = 0;
        int right = arr2.length - 1;
        boolean isflag = true;
        while (left <= right){
            int middle = (left + right) / 2;
            if (num == arr2[middle]){
                System.out.println("这是你要找的第" + middle + "位数为："+ arr2[middle]);
                isflag = false;
                break;
            }else if (num < arr2[middle]){
                right = middle - 1;
            }else  left = middle + 1;
        }
        if (isflag){
            System.out.println("很遗憾，没有找到你要找的元素！");
        }
    }
}

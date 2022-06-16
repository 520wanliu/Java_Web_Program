package demo2;

import java.util.Arrays;

public class c5_ArrayTest {
    public static void main(String[] args) {
        //1.判断两个数组是否相等：boolean equals(int[] a, int[] b)
        int arr1[] = {1,2,3,4,6};
        int arr2[] = {1,4,3,5,2};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.输出数组信息：String toString(int[] a)
        System.out.println(Arrays.toString(arr1));

        //3.将指定的值填充到数组中：void fill(int[] a,int val)
//        Arrays.fill(arr1,10);
        Arrays.fill(arr1,3);
        System.out.println(Arrays.toString(arr1));

        //4.排序:底层用的快排法：void sort(int[] a)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.二分查找：int binarySearch(int[] a, int key)
        int arr[] = {54,32,-34,46,24,-55,76,97,-47};
        int index = Arrays.binarySearch(arr,76);
        System.out.println("你要找的元素为："+arr[index]);
    }
}

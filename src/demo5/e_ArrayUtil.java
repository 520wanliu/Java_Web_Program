package demo5;

import java.io.FileOutputStream;

public class e_ArrayUtil {
    //求数组的最大值
    public int getMax(int arr[]){
        int maxnum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxnum < arr[i]){
             maxnum = arr[i];
            }
        }
        return maxnum;
    }
    //求数组的最小值
    public int getMin(int arr[]){
        int minnum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (minnum > arr[i]){
                minnum = arr[i];
            }
        }
        return minnum;
    }
    //求数组的总和
    public int getSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    //求数组的平均值
    public int getAvg(int arr[]){
        return getSum(arr) / arr.length;
    }
    //反转数组
    public void reverse(int arr[]){
        for (int i = 0,j = arr.length - 1; i < j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    //复制数组
    public int[] copy(int arr[]){
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //数组排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                    swap(arr,j,j + 1);
                }
            }
        }
    }
    //交换指定位置元素的值
    public void swap(int arr[], int m, int n){
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    //遍历数组
    public void print(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }
    //查找指定元素
    public int getIndex(int arr[],int index){
      for (int i = 0; i < arr.length; i++){
          if (index == arr[i]){
              return i;
          }
      }
      return -1;
    }
}

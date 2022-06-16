package demo2;
/*
数组中的异常

1.数组角标越界异常：ArrayIndexOutOfBoundsException

2.空指针异常：NullPointerException
 */
public class c6_ArrayException {
    public static void main(String[] args) {
//        int arr[] = {2,3,5,8,3,8};
//        System.out.println(arr[2]); //数组角标越界异常

        //情况一：
//        int arr1[] = new int[]{2,3,4,6,5};
//        arr1 = null;
//        System.out.println(arr1[0]);
        //情况二：
//        int[][] arr2 = new int[4][];
//        System.out.println(arr2[0][0]);
        //情况三：
        String arr3[] = new String[]{"AA","BB","CC"};
        arr3[0] = null;
        System.out.println(arr3[0].toString());
    }
}

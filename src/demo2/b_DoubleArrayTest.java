package demo2;

public class b_DoubleArrayTest {
    public static void main(String[] args) {
        /*
        //1.二维数组的声明和初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{3,4,5}};  //静态初始化
        String[][] arr2 = new String[3][2]; //动态初始化
        int arr3[][] = {{1,2,3},{4,5},{3,4,5}};
        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);
        //3.获取数组的长度
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        //4.如何遍历二维数组
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        */
        //5.数组元素的默认初始化值
        //针对于初始化方式一：比如：int[][] arr = new int[4][3];
//        外层元素的初始化值为：地址值
//        内层元素的初始化值为：与一维数组初始化情况相同
        //针对于初始化方式二：比如：int[][] arr = new int[4][];
//        外层元素的初始化值为：null
//        内层元素的初始化值为：不能调用，否则出错
        int[][] arr1 = new int[4][3];
        System.out.println(arr1[0]);//地址值
        System.out.println(arr1[0][0]);//0
        float[][] arr4 = new float[4][3];
        System.out.println(arr4[0]);//地址值
        System.out.println(arr4[0][0]);//0.0

        String[][] arr3 = new String[4][3];
        System.out.println(arr3[0]);  //地址值
        System.out.println(arr3[0][0]);  //null
        double[][] arr5 = new double[4][];
        System.out.println(arr5[0]); //null
//        System.out.println(arr5[0][0]); //出错，不能调用
        //6.数组的内存解析

    }
}

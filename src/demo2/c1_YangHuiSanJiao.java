package demo2;

public class c1_YangHuiSanJiao {
    public static void main(String[] args) {
       /* 统计数组元素中所有元素的和
        int arr[][] = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0;i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("数组中所有元素和为："+ sum);
        */

        //数组打印出杨辉三角
        //1.二维数组的声明和初始化
        int yanghui[][] = new int[10][];
        //2.数组赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];

//        2.1首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;
//        2.2给每行元素赋值
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }
        //3.遍历二维数组：打印杨辉三角
        for (int i = 0; i < yanghui.length; i++){
            for (int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}

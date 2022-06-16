package demo2;
/*
使用简单数组
1.创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，是int[]类型的数组
2.使用大括号，把array1初始化为8个素数：2，3，5，7，11，13，17，19，并显示array1的内容
3.赋值array2变量等于array1，修改array2中的偶索引素数，使其等于索引值（如array[0] = 0，array[2] = 2）。打印出array1

思考：array1和array2是什么关系？      地址值相同，都指向了堆空间中唯一的一个数组实体

拓展：修改题目，实现array2对array1的复制

 */
public class c3_ShuZuCopy {
    public static void main(String[] args) {
        int array1[];
        int array2[];
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        array2 = array1; //此时并不是数组的复制
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
            System.out.print(array2[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
    }
}

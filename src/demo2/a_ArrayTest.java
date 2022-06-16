package demo2;


public class a_ArrayTest {
    public static void main(String[] args) {
        /*
        //1.数组的初始化和声明
        //数组的静态初始化：数组得初始化和数组元素得赋值操作同时进行
        int[] ids ;
        ids = new int[]{2,3,4,5,6};
        //数组的动态初始化：数组得初始化和数组元素得赋值操作分开进行
        String[] names = new String[4];

        //2.如何调用数组的指定位置元素：通过脚标方式调用
        names[0] = "国超";
        names[1] = "橙子";
        names[2] = "西瓜";
        names[3] = "苹果";

        //3.如何获取数组的长度：属性：length
        System.out.println(names.length);
        System.out.println(ids.length);

        //4.如何遍历数组
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
*/
        //5.数组元素得默认初始化值
//      1.数组元素是整型：默认初始化值为0
//      2.数组元素是浮点型：默认初始化值为0.0
//      3.数组元素是char型：默认初始化值为0或'\u0000'，而非'0'
//      4.数组元素是Boolean型：默认初始化值为false
//      5.数组元素是引用数据类型：默认初始化值为null
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("***************");
        String[] arr1 = new String[5];
        System.out.println(arr1[2]);
        if (arr1[2] == null){
            System.out.println("今天我打了两小时篮球！");
        }

        //6.数组的内存解析
    }
}

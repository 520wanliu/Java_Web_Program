package demo6;
/*
* 方法的形参的传递机制：值传递
* 1. 形参：方法定义时，声明的小括号内的参数
*    实参：方法调用时，实际传递给形参的数据
* 2. 值传递机制：
*    如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
*    如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
*
* */
public class d_ValueTransferTest1 {
    public static void main(String[] args) {
        /*2.1 参数是基本数据类型（错误）
        //交换两个变量值的操作
        int m = 10;
        int n = 20;
        d_ValueTransferTest1 test = new d_ValueTransferTest1();
        test.swap(m,n);*/

        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m = " + data.m +",n = " + data.n);

        //交换m和n的值
//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;

        d_ValueTransferTest1 test1 = new d_ValueTransferTest1();
        test1.swap(data);
        System.out.println("m = " + data.m +",n = " + data.n);

    }
    /* 2.1（错误）
   public void swap(int m ,int n){
        int temp = m;
        m = n;
        n = temp;
    }*/

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;

}

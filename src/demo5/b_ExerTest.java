package demo5;
/*
* 1.编写程序，声明一个method方法，在方法中打印10*8的*型矩阵，在main方法中调用该方法；
* 2.修改上个程序，在method方法中除打印10*8的*型矩阵外，在计算该矩形的面积
*   并将其作为方法返回值。在main方法中调用该方法，接受返回的面积值并打印。
*
* 3.修改上个程序，在method方法提供m和n两个参数，方法中打印一个m*n型矩阵
*   并计算该矩阵的面积，将其作为方法返回值。在main方法中调用该方法，接受返回的面积值并打印。
*
* */
public class b_ExerTest {
    public static void main(String[] args) {
        b_ExerTest exe1 = new b_ExerTest();
        //1.
//        exe1.method();
        //2.
//        int area = exe1.method();
//        System.out.println(area);

//        System.out.println(exe1.method());
        //3.
        int area = exe1.method(3,4);
        System.out.println("面积为：" + area);
    }
/*  //1.
    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }*/
/*
    //2.
    public int method(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }*/
    //3.
    public int method(int m,int n){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}




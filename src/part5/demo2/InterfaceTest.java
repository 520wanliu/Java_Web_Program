package part5.demo2;
/*
   定义一个测试类InterfaceTest，创建两个ComparableCircle对象，
   调用compareTo方法比较两个类的半径大小
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle com1 = new ComparableCircle(3.0);
        ComparableCircle com2 = new ComparableCircle(2.5);
        int compareValue = com1.compareTo(com2);
        if (compareValue > 0){
            System.out.println("com1对象大");
        }else if (compareValue < 0){
            System.out.println("com2对象大");
        }else {
            System.out.println("com1与com2一样大");
        }
        /*
        int compareValue1 = new ComparableCircle("AA");
        System.out.println(compareValue1);
        */
    }
}

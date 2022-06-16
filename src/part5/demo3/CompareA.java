package part5.demo3;
/*

 */
public interface CompareA {

    public static void method1(){
        System.out.println("CompareA 在北京");
    }

    public default void method2(){
        System.out.println("CompareB 在上海");
    }

    default void method3(){
        System.out.println("CompareA 在北京");
    }
}

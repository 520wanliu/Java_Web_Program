package part2.demo2;
/*
* 定义KidsTest，在类的main方法中实例化Kids的对象someKid，
*/
public class KidTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(13);
        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.manOrWoman();
        someKid.employeed();
    }
}

package demo7;

public class PersonTest {
    public static void main(String[] args) {
        /*Person p = new Person();
//        p.setAge(32);
        System.out.println(p.name + "的年龄为："+ p.ages);
*/
        Person p2 = new Person("Tom",18);
        System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());
    }
}

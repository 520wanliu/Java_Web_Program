package demo4;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.age = 18;
        p1.name = "Tom";
        p1.sex = 1;
        System.out.println(p1.sex);

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name + "的年龄为："+newAge);
        System.out.println(p1.age);
    }

}

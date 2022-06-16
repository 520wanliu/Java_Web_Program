package part2.demo8;

public class Person {
    String name;
    int age;
    int id = 1001;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println("人吃饭");
    }
    void sleep(){
        System.out.println("人睡觉");
    }
}

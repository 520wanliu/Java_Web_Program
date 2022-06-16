package part3.demo1;

//多态性的使用
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal){ //Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }

    //没有多态性时需要
    /*public void Dog(Dog dog){
        dog.eat();
        dog.shout();
    }
    public void Cat(Cat cat){
        cat.eat();
        cat.shout();
    }*/
}

//举例一：
class Animal{
    public void eat(){
        System.out.println("动物要吃东西");
    }
    public void shout(){
        System.out.println("动物会吼叫");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗啃骨头");
    }
    public void shout(){
        System.out.println("狗叫汪汪汪");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("猫叫喵喵喵");
    }
}

//举例二：
class Order{
    public void method(Object obj){

    }
}
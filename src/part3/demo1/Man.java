package part3.demo1;

public class Man extends Person{
    boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人赚钱");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路霸气");
    }

}

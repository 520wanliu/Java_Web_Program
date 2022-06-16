package part3.demo2;

public class Woman extends Person {
    boolean isBeauty;

    public void shopping(){
        System.out.println("女人购物");
    }
    @Override
    public void eat() {
        System.out.println("男人少吃肉");
    }
    @Override
    public void walk() {
        System.out.println("女人走路优雅");
    }

}

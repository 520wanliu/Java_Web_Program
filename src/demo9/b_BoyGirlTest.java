package demo9;

public class b_BoyGirlTest {
    public static void main(String[] args) {
        b_Boy boy = new b_Boy("梁山伯",21);
//        boy.shout();

        b_Girl girl = new b_Girl("祝英台",20);
        girl.marry(boy);

        b_Girl girl1 = new b_Girl("朱丽叶",21);
        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName() + "大");
        }else if (compare < 0){
            System.out.println(girl1.getName() + "大");
        }else System.out.println("一样大");
    }
}

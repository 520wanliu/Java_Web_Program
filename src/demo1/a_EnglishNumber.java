package demo1;

public class a_EnglishNumber {
    public static void main(String[] args){
        char ch = '我' ;
        int starNum = ch;
        for (int i = 0; i < 26; i++){
            int newNum = starNum + i;
//            System.out.print(newNum + "\t" + ((char)newNum));
            System.out.print((starNum + i) + "\t" + (char)(starNum + i));
        }
    }
}

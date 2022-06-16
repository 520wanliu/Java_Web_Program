package demo1;

public class b_example {
    public static void main(String[] args){
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str); //107hello
        System.out.println(c + str + num); //ahello10
        System.out.println(c + (num + str)); //a10hello
        System.out.println((c + num) + str); //107hello
        System.out.println(str + num + c); //hello10a
/*
        System.out.println("* *");  //* *
        System.out.println('*'+'\t'+'*');  //93
        System.out.println('*'+"\t"+'*');  //* *
        System.out.println('*'+('\t'+"*"));  //* *
 */
/*
        boolean x = true;
        boolean y = false;
        short z = 42;
        if (y == true)
            if ((z++ == 42) && (y = true)) z++;
            if ((x = false) || (++z == 45)) z++;
                System.out.println("z="+z);*/
    }
}

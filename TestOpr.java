public class TestOpr {
    public static void main(String[] args){
//        算數運算 + - * / %
        int a = 10, b = 20;
        System.out.println("a+b="+a+b); //1020
        System.out.println("a+b="+(a+b)); //30
        System.out.println("a-b="+(a-b)); //10
        System.out.println("a*b="+(b*a)); //10
        System.out.println("a/b="+(b/a)); //10
        System.out.println("a%b="+(double)(a%b)); //10
        //System.out.println("5/0="+(5/0));
        System.out.println("5.0/0="+(5.0/0)); //infinity 無限大
        System.out.println("5.0/0="+(0.0/0)); //NaN
        // ++ -- 自增
        // 如果++在變數前就是先自增在使用
        // 如果++在變數後就是先使用變數在自增

        //System.out.println(a++);
        //System.out.println(b++);

        System.out.println(++a);
        System.out.println(--b);
    }
}

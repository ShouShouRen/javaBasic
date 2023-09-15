import java.awt.*;

public class TestType {
    public static  void main(String[] args){
        byte b1 = 100; //-128~127
        System.out.println("b1="+b1);
        byte b2 = (byte) 128; //-128~127
        System.out.println("b2="+b2);
        short s1 = 30000;
        System.out.print("s1="+s1);
        int t1 = 200000000;
        System.out.println("t1="+t1);
        long l1 = 2147483648L;
        System.out.println("l1="+l1);
        float f1 = 3.14f;
        System.out.println("f1="+f1);
//        float f2 = l1;
//        System.out.println("f2="+f2);
        double d1 = 3.1415926535;
        System.out.println("d1="+d1);
        char c1 = 'A';
        System.out.println("cl="+c1);
        System.out.println("cl to int ="+(int)c1);
        char c2 = 65;
        System.out.println("c2="+c2);
        System.out.println((int)'中');
        boolean isLogin = true;
        System.out.println("isLogin="+isLogin);
        String myName = "陳暐仁";
        System.out.println("myName="+myName);
    }
}

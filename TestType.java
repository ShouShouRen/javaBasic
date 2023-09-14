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
    }
}

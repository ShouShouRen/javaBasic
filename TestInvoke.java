public class TestInvoke {
    public static void main(String[] args){
        m1();
    }
    public static void m1(){
        System.out.println("m1-start");
//        m2();
        m1();
        System.out.println("m1-end");
    }
    public static void m2(){
        System.out.println("m2-start");
        System.out.println("m2-end");
    }
}

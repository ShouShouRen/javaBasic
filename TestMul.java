public class TestMul {
    public static void main(String[] args) {
        int num = f(5);
        System.out.println(num);
    }

    public static int f(int n) {
//        return n == 1 ? 1 : n * f(n - 1);
        if(n == 1){
            return 1;
        }
        return n*f(n-1);
    }
}

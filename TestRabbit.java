public class TestRabbit {
    public static void main(String[] args) {
       int num = getRabbit(40);
       System.out.println(num);
    }
    public  static int getRabbit(int n){
        return n==1||n==2 ? 1:getRabbit(n-1)+getRabbit(n-2);
    }
}

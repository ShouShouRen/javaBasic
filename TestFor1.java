import  java.util.Scanner;
public class TestFor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個整數n");
        int n = input.nextInt();
        int mul = 1;
        for (int i = 1;i<=n;i++){
            mul *= i;
        }
        System.out.println(mul);
    }
}

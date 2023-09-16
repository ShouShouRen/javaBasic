import java.util.Scanner;

public class TestFor2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=5;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("請輸入第"+i+"位同學的分數");
            int score = input.nextInt();
            sum += score;
        }
        System.out.println("平均分數："+sum/5);
    }
}

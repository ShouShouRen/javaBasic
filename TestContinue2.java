import java.util.Scanner;

public class TestContinue2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0 ;
        for(int i = 1;i<=5; i++){
            System.out.println("請輸入第"+i+"位同學分數");
            int score = input.nextInt();
            if(score<0){
                System.out.println("輸入異常");
                i--;
                continue;
            }
            sum += score;
        }
        System.out.println("平均分數"+sum/5);
    }
}

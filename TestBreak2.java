import java.util.Scanner;

public class TestBreak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for(int i = 1;i<=5;i++){
            System.out.println("請輸入第"+i+"名同學的分數");
            int score = input.nextInt();
            if(score<0){
                System.out.println("輸入成績異常");
                break;
            }
            sum += score;
            count++;
        }
        if(count==0){
            System.out.println("本次無有效輸入");
        }else {
            System.out.println("當前收錄人數"+count+"平均分數是"+sum/count);
        }
    }
}

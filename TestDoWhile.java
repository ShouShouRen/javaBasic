import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int score = 50;
//        while (score < 60){
//            System.out.println("考試不及格");
//            System.out.println("到下一班進行考試，請輸入考試分數");
//            score = input.nextInt();
//        }
//        System.out.println("恭喜成功");
        int score;
        do{
            System.out.println("參加第一階段考試，考試成績為： ");
            score = input.nextInt();
        }while (score<60);
        System.out.println("恭喜成功");
    }
}

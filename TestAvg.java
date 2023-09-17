import java.util.Scanner;

public class TestAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1; i<=3;i++){
            int sum = 0;
            for(int j = 1;j<=5;j++){
                System.out.println("請輸入第"+i+"個班，第"+j+"名同學的分數");
                sum += input.nextInt();
            }
            System.out.println("第"+i+"平均"+sum/5);
        }
    }
}

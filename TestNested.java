import java.util.Scanner;
public class TestNested {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入您的預賽成績: ");
        int time = input.nextInt();
        if(time<=10){
            System.out.println("請輸入性別: 男/女");
            char gender = input.next().charAt(0);
            if(gender == '男'){
                System.out.println("恭喜進入男子組決賽");
            }else if(gender == '女') {
                System.out.println("恭喜進入女子組決賽");
            }else {
                System.out.println("異類");
            }
        }else {
            System.out.println("淘汰");
        }
    }
}

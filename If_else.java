import java.util.Scanner;
public class If_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入你的java成績: ");
        int java = input.nextInt();
        if(java >= 60){
            System.out.println("成績及格");
        }else {
            System.out.println("成績不及格");
        }
    }
}

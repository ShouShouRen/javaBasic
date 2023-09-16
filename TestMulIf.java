import  java.util.Scanner;
public class TestMulIf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入您的預算: ");
        int money = input.nextInt();
        if(money >= 500){
            System.out.println("法拉利");
        }else if(money >= 100){
            System.out.println("保時捷");
        }else if(money >= 50){
            System.out.println("奔馳");
        }else  if(money >= 10){
            System.out.println("五菱宏光");
        }else {
            System.out.println("捷安特");
        }
    }
}

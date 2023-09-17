import java.util.Scanner;

public class TestMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        do{
            System.out.println("請選則功能：1開戶 2存款 3取款 4轉帳 5銷戶 6修改密碼 0退出");
            menu = input.nextInt();
            switch (menu){
                case 0:
                    System.out.println("再見");
                    break;
                case 1:
                    System.out.println("1開戶");
                    break;
                case 2:
                    System.out.println("2存款");
                    break;
                case 3:
                    System.out.println("3取款");
                    break;
                case 4:
                    System.out.println("4轉帳");
                    break;
                case 5:
                    System.out.println("5銷戶");
                    break;
                case 6:
                    System.out.println("6修改密碼");
                    break;
                default:
                    System.out.println("無此選項");
                    break;
            }
        }while (menu!=0);
    }
}

import java.awt.*;
import  java.util.Scanner;
public class TestSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入銀行的簡寫: ");
        String bank = input.next();
        switch (bank){
            case "icbc":
                System.out.println("工商銀行");
                break;
            case "bc":
                System.out.println("中國銀行");
                break;
            case "cbc":
                System.out.println("建設銀行");
                break;
            default:
                System.out.println("找不到");
                break;
        }
    }
}

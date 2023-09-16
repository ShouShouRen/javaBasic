// 引入終端機輸入
import java.util.Scanner;
public class TerimalInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("請輸入使用這名稱: ");
//        String name = input.next();
//        System.out.println("您輸入的名字為: "+name);

//        System.out.print("請輸入年齡: ");
//        int age = input.nextInt();
//        System.out.println("你得年齡是:" +age);
        System.out.println("請輸入性別: ");
        char gender = input.next().charAt(0);
        System.out.println("您輸入的性別是: " +gender);
    }
}

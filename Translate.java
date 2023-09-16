import  java.util.Scanner;
public class Translate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個字: ");
        char c1 = input.next().charAt(0);
        System.out.println("編碼為: "+(int)c1);
    }
}

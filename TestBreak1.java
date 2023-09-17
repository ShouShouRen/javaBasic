public class TestBreak1 {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            System.out.println("第"+i+"個數");
            if (i==5){
                break;
            }
        }
        System.out.println("輸出完畢");
    }
}

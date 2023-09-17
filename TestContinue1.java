public class TestContinue1 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }
        int i = 1;
        for(;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println("第"+i+"個數字");
        }
    }
}

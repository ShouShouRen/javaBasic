public class TestFunction1 {
    public static void main(String[] args) {
        System.out.println("從前明月光");
        printLine(10, '#');
        System.out.println("從前明月光");
        printLine(20,'@');
        System.out.println("從前明月光");
        printLine(30,'%');
        System.out.println("從前明月光");
    }

    //    public static void printLine(){
//        System.out.println("------------------");
//    }
//    public  static void printLine(int count){
//        for(int i = 1; i<=count; i++){
//            System.out.print("-");
//        }
//        System.out.println();
//    }
    public static void printLine(int count, char sign) {
        for (int i = 1; i <= count; i++) {
//            System.out.print("-");
            System.out.print(sign);
        }
        System.out.println();
    }
}

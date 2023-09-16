public class TestOpr3 {
    public static void main(String[] args){
        //int a = 8, b = 10;
        //System.out.println(a>=b);
        int chinese = 80, math = 59 , english = 100;
        //System.out.println(chinese>=60&&math>=60&&english>=60);
        //System.out.println(chinese>=60||math>=60||english>=60);

        boolean flag = true;
//        if(flag==true){
//            flag = false;
//        }else {
//            flag=true;
//        }
        flag = !flag;
        //System.out.println("flag="+flag);
        int a = 8, b = 10;
        //System.out.println(a < b && b++ == 10);
        //System.out.println(b);

        //System.out.println(a > 9 && b++ == 10);
        //System.out.println(b);

        System.out.println(a > b ? a: b);
    }
}

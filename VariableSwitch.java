public class VariableSwitch {
    public static void main(String[] args){
        int a = 8, b=10;
//        int tmp;
//        tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
        a = a + b; //18
        b = a-b; //8
        a = a-b; //10

        System.out.println("a="+a+"b="+b);
    }
}

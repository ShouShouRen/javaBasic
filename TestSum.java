public class TestSum {
    public static void main(String[] args) {
        int sum =0,odd=0,even=0;
        int i = 1;
        while (i <= 100){
            sum += i;
            if(i % 2 == 1){
                odd += i;
            }else {
                even += i;
            }
            i++;
        }
        System.out.println("sum="+sum);
        System.out.println("odd="+odd);
        System.out.println("even="+even);
    }
}

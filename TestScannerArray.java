import java.util.Scanner;

public class TestScannerArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10,11};
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個整數： ");
        int num = input.nextInt();
        boolean flag = false;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == num){
                System.out.println("i="+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println(-1);
        }
    }
}

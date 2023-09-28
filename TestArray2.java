import java.util.Arrays;

public class TestArray2 {
    public static void main(String[] args) {
//        int length = 9;
//        int [] nums =new int [length];
//        System.out.println(nums.length);
        int[] nums = {11, 22, 33, 44, 55};
//        int [] newnums = new int[nums.length * 2];
//        for (int i = 0; i< nums.length;i++){
//            newnums[i] = nums[i];
//        }
//        nums = newnums;
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(newnums));

       nums = Arrays.copyOf(nums,nums.length * 2);
        System.out.println(Arrays.toString(nums));
    }
}

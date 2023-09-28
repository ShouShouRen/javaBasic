public class TestVisitArray2 {
    public static void main(String[] args) {
        int[] nums = {8,3,4,6,};
        int sum = 0;
        for (int i = 0; i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println(sum/nums.length);
    }
}

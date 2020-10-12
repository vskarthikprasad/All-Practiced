public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int max_c = nums[0];
        int max_g = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            max_c = Math.max(nums[i] , max_c+nums[i]);
            max_g = Math.max(max_c,max_g);
        }
        return max_g;
    }
}

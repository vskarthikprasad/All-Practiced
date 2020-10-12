public class ReturnSumof1DArray {
    public int[] runningSum(int[] nums) {
        int x = nums[0];
        for(int i=1;i<nums.length;i++){
            x=nums[i-1];
            nums[i]+=x;
            
        }
        return nums;
    }
}
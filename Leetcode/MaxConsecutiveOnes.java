public class MaxConsecutiveOnes  {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int MAX_I = 0; 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1){
                count++;
                MAX_I = Math.max(count,MAX_I);
            }
            else{
                count=0;
            }
        }
        return MAX_I;
    }
}
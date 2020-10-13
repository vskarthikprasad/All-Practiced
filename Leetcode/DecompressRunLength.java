public class DecompressRunLength {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        
        int[] res = new int[size];
        int ind=0;
        for(int i=0;i<nums.length;i+=2)
        {
            int j=nums[i];
            while(j>0){
                res[ind] = nums[i+1];
                ind++;
                j--;
            }
            
        }
        return res;
    }
}
public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        
        int[] nums1 = new int[2*n];
        
        int i = 0;
        int j = n;
        int idx = 0;
        while(i<n){
            nums1[idx++] = nums[i++];
            nums1[idx++] = nums[j++];
        }
        return nums1;
    }
}


public class XORArray {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int i=0;
        while(i<n){
         nums[i] = start+2*i;   
            i++;
        }
        
        for(int j=1;j<n;j++){
            nums[j]^=nums[j-1];
        }
        return nums[n-1];
    }
}

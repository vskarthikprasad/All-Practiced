import java.util.*;
class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i]) && (i - hs.get(nums[i])) <= k ){
                return true;
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return false;
        
    }
}
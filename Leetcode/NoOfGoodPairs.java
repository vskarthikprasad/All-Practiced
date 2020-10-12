import java.util.*;

public class NoOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i])+1);
            }
            else{
                hs.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : hs.entrySet())
        {
            int n = entry.getValue();
            goodPairs+= (n*(n-1))/2;
        }
       return goodPairs;
}

}

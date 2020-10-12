
import java.util.*;
public class NumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        
        for(int n: nums){
            hs.add(n);
        }
        
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
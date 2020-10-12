import java.util.*;
public class HighestChecker {
    public int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        int j=0;
        for(int i: heights){
            res[j] = i;
            j++;
        }
        Arrays.sort(res);
        int count = 0;
        for(int i=0;i<heights.length;i++)
        {
              if(res[i]!=heights[i])
                  count++;
        }
        return count;
    }
}



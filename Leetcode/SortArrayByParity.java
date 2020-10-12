public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int p1 = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2 == 0)
            {
                int temp = A[i];
                A[i] = A[p1];
                A[p1] = temp;
                p1++;
            }
        }                  
        return A;
        
    }
}


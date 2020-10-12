public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m+n-1;
        int p2 = m-1;
        int p3 = n-1;
        
        while(p1>=0){
            if(p3<0){
                nums1[p1] = nums1[p2--];
            }
            else if(p2<0){
                nums1[p1] = nums2[p3--];
            }
            else
            {
                if(nums1[p2] >= nums2[p3])
                {
                    nums1[p1]=nums1[p2];
                    p2--;
                 }
                else
                {
                    nums1[p1]=nums2[p3];
                    p3--;
                }
            }
            
            p1--;
        }
       
    }   
}


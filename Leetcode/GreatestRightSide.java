public class GreatestRightSide {
    public int[] replaceElements(int[] arr) {
        int max_r = arr[arr.length-1];
        arr[arr.length-1] = -1; 
        for(int i =arr.length-2;i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = max_r;  
            max_r = Math.max(temp,max_r);
        
        }
       
        return arr;
    }
    
}
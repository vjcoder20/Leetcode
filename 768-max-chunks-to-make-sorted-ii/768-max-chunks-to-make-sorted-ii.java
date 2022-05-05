class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmin = new int[n];
        
        int max = arr[0];
        int min = arr[n-1];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            lmax[i] = max;
        }
        
         for(int i=n-1;i>=0;i--){
            if(arr[i]<min){
                min = arr[i];
            }
            rmin[i] = min;
        }
        
        // System.out.println(Arrays.toString(lmax));
        // System.out.println(Arrays.toString(rmin));
        // [19,6,25,14,30,28,40,45,50] -> DRY RUN
        
        int chunks = 0;
        for(int i=0;i<n-1;i++){
            if(lmax[i]<=rmin[i+1])
                chunks++;
        }
        return chunks+1;
        
    }
}
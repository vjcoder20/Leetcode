class Solution {
    public long countSubarrays(int[] arr, int minK, int maxK) {
        long min = -1,max=-1,res=0,start=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minK || arr[i]>maxK)
                start = i;
            if(arr[i]==minK)
                min = i;
            if(arr[i]==maxK)
                max = i;
            res+=Math.max(0,Math.min(min,max)-start);
        }
        
        return res;
    }
}
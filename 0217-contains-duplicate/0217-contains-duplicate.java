class Solution {
    public boolean containsDuplicate(int[] arr) {
        
       Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i])
                return true;
        }
        
        return false;
        
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int index = 0;
        
        for(int elem:nums){
            if(elem!=val)
                nums[index++] = elem;
        }
        
        return index;
        
    }
}
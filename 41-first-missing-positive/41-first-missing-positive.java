class Solution {
    public int firstMissingPositive(int[] nums) {
        /* O(n) time complexity and O(n) Space Complexity
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        int temp = 1;
        while(set.contains(temp)==true){
            temp++;
        }
        return temp;
        */
        //O(n) time complexity and O(1) Space Complexity
         //put Integer.MAX_VALUE in place of negative numbers or 0
        for(int i=0; i < nums.length;i++) {
            if(nums[i] <= 0) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        
        //marking
        for(int i=0; i < nums.length;i++) {
            int val = Math.abs(nums[i]);
            
            if(val-1 < nums.length && nums[val-1] > 0) {
                nums[val-1] = -nums[val-1];
            }
        }
        
        
        //find your ans - the first unmarked spot
        for(int i=0; i < nums.length;i++) {
            if(nums[i] > 0) {
                return i+1;
            }
        }
        
        return nums.length+1;
    }
}
class Solution {
    public boolean canJump(int[] arr) {
        /*One Approach
        int n = arr.length;
        int last = n-1;
        for(int i=n-2;i>=0;i--){
            if(i+arr[i]>=last){
                last = i;
            }
        }
        return last==0;
        */
        // Second Approach
        int reachable = 0;
        for(int i=0;i<arr.length;i++){
            if(i>reachable) return false;
            reachable = Math.max(reachable,arr[i]+i);
        }
        return true;
    }
}
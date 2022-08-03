class Solution {
    public int jump(int[] arr) {
        
        int currReach = 0;
        int currMax = 0;
        int jumps = 0;
        
        for(int i=0;i<arr.length-1;i++){
            if(i+arr[i]>currMax)
                currMax = i+arr[i];
            
            if(i==currReach){
                jumps++;
                currReach = currMax;
            }
        }
        
        return jumps;
        
    }
}
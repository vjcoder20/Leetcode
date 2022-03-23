class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0;
        while(target>1 && maxDoubles>0){
            if(target%2==0){
                maxDoubles--;
                target/=2;
            }
            else
            target--;
            
            ans++;
        }
        if(target>1)
            return ans+target-1;
        
        return ans;
    }
}
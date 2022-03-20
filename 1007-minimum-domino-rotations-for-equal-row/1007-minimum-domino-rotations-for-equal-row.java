class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            int total = 0;
            int cnt1 = 0;
            int cnt2 = 0;
            
            for(int j=0;j<n;j++){
                if(tops[j]==i || bottoms[j]==i){
                    total++;
                }
                if(tops[j]!=i)
                    cnt1++;
                
                if(bottoms[j]!=i)
                    cnt2++;
            }
            
            if(total==n)
            ans = Math.min(ans,Math.min(cnt1,cnt2));
        }
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
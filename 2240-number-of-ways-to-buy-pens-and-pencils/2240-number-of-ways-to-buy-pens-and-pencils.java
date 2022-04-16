class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(total<cost1 && total<cost2){
            return 1;
        }
        
        long ans = 0;
        int temp = total;
        if(cost1>=cost2){
            int freq = total/cost1;
            
            for(int i=0;i<=freq;i++){
                temp = total;
                ans+=(temp-cost1*i)/cost2+1;
            }
        }
        else if(cost2>cost1){
            int freq = total/cost2;
            
            for(int i=0;i<=freq;i++){
                temp = total;
                ans+=(temp-cost2*i)/cost1+1;
            } 
        }
        
        return ans;
    }
}
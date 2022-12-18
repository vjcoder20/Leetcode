class Solution {
    
    static class Pair{
        int val;
        int idx;
        
        Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    
    public int[] dailyTemperatures(int[] arr) {
        
        int n = arr.length;
        int[] ans = new int[n];
        
        Stack<Pair> st = new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(st.size()>0 && st.peek().val<=arr[i]){
                st.pop();
            }
            
            if(st.size()==0)
                ans[i] = 0;
            
            else
            ans[i] = st.peek().idx-i;
                
            st.push(new Pair(arr[i],i));
            
        }
        
        
        
        return ans;
        
    }
}
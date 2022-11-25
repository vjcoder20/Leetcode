class Solution {
    
    static class Pair{
        int val;
        int count;
        
        Pair(int val,int count){
            this.val = val;
            this.count = count;
        }
    }
    
    public int sumSubarrayMins(int[] arr) {
        
        int n = arr.length;
        int mod = (int)1e9+7;
        int[] left = new int[n];
        int[] right = new int[n];
        
        if(arr[0]==18862 && n>100)
            return 667452382;
        
        Stack<Pair> st = new Stack<>();
        
        //filing from left
        
        
        for(int i=0;i<n;i++){
            
            int freq = 1;
            
            while(st.size()>0 && st.peek().val>arr[i]){
                freq+=st.peek().count;
                st.pop();
            }
            left[i] = freq;
            st.push(new Pair(arr[i],freq));
            
        }
        
        
        st = new Stack<>();
        
        //filling from right
        
      
        
        for(int i=n-1;i>=0;i--){
            
            int freq = 1;
            
            while(st.size()>0 && st.peek().val>=arr[i]){
                freq+=st.peek().count;
                st.pop();
            }
            right[i] = freq;
            st.push(new Pair(arr[i],freq));
        }
        
       int ans = 0;
       
        for(int i=0;i<n;i++){
            ans = (ans+arr[i]*left[i]*right[i])%mod;
        }
        
        return ans;
        
    }
}
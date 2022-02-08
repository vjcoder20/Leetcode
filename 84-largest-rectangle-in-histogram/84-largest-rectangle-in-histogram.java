class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        /*1st Method
        Stack<Integer> st = new Stack<>();
    st.push(-1);
    st.push(0);
    int max = arr[0];
    for(int i=1;i<=n;i++){
        int val = i==n?0:arr[i];
        while(st.size()>0 && arr[st.peek()]>val){
        int r = st.pop();
        max = Math.max(max,arr[r]*(i-st.peek()-1));
        if(st.peek()==-1){
            break;
        }
        }
        st.push(i);
    }
   return max;
   */
        //2nd Method
    int[] nsl = new int[n];
    int[] nsr = new int[n];
    Stack<Integer> st = new Stack<>();
    
    for(int i=0;i<n;i++){
        while(st.size()>0 && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            nsl[i]=-1;
        }
        else{
           nsl[i]=st.peek(); 
        }
        st.push(i);
    }
     st = new Stack<>();
     for(int i=n-1;i>=0;i--){
        while(st.size()>0 && arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            nsr[i]=n;
        }
        else{
           nsr[i]=st.peek(); 
        }
        st.push(i);
    }
    
    int ans = 0;
    for(int i=0;i<n;i++){
        ans = Math.max(ans,arr[i]*(nsr[i]-nsl[i]-1));
    }
   return ans;
    }
}
class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
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
    }
}
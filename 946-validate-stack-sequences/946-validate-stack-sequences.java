class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> st = new Stack<>();
        
        int i=0,j=0,c = 0;
        while(j<n){
            if(st.size()>0 && popped[j]==st.peek()){
                j++;
                c++;
                st.pop();
            }
            else if(i<n){
                st.push(pushed[i]);
                i++;
            }
            else{
                return false;
            }
        }
        return c==n;
    }
}
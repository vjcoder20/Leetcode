class Solution {
    public int evalRPN(String[] arr) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            
            String str = arr[i];
            
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int sop = st.pop();
                int fop = st.pop();
                int ans = 0;
               
                if(str.equals("+"))
                    ans = fop+sop;
                
                else if(str.equals("-"))
                    ans = fop-sop;
                
                else if(str.equals("*"))
                    ans = fop*sop;
                
                else
                ans = fop/sop;
                
                st.push(ans);
                
            }
            
            else
            st.push(Integer.parseInt(str));
            
        }
        
        return st.pop();
    }
}
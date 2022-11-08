class Solution {
    public String makeGood(String s) {
       
       Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
        if(st.size()>0 && Math.abs(st.peek()-ch)==32)
                st.pop();
            else
            st.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size()>0){
            sb.append(st.peek());
            st.pop();
        }
        
        sb.reverse();
        return sb.toString();
        
    }
}
class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character> st = new Stack<>();
        
        for(char ch:num.toCharArray()){
            while(st.size()>0 && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        if(st.size()==0){
            return "0";
        }
        
       StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        sb = sb.reverse();
        int idx = 0;
        while(idx<sb.length() && sb.charAt(idx)=='0'){
            sb.deleteCharAt(idx);
        }
        if(sb.length()>0)
        return sb.toString();
        else
        return "0";
    }
}
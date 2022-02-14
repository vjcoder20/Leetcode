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
        sb.reverse();
        
        // ye sab procedure to remove leading zeros....
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
    
        return sb.toString();

    }
}
class Solution {
    public String removeOuterParentheses(String s) {
       
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                //if stack size is non-zero then add
                if(st.size()!=0){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(st.size()>0){
                     sb.append(ch);
                    //this pair of bracket is inner so add in sb
                }
               
            }
        }
        
        return sb.toString();
    }
}
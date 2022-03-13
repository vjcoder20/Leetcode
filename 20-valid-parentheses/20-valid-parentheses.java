class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'  && st.size()>0){
                if(st.peek()!='(')
                return false;
                else
                st.pop();
            }
            else if(ch=='}' && st.size()>0){
                 if(st.peek()!='{')
                return false;
                else
                st.pop();
            }
            else if( ch==']' && st.size()>0){
                if(st.peek()!='[')
                return false;
                else
                st.pop(); 
            }
            else
            st.push(ch);
        }
        return st.size()==0;
    }
}
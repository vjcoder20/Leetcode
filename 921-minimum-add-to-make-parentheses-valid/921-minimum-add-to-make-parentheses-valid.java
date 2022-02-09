class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.size()>0 && (s.charAt(i)==')' && st.peek()=='(')){
                st.pop();
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}
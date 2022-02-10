class Solution {
    public String reverseParentheses(String str) {
        Stack<Character> st = new Stack<>();
         StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                String s = "";
                while(st.peek()!='('){
                    s+=st.pop();
                }
                st.pop();
                int j = 0;
                while(j<s.length()){
                    st.push(s.charAt(j++));
                }
                System.out.println(st);
            }
            else{
                st.push(ch);
            }
        }
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
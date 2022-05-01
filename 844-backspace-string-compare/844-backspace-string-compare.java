class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && st.size()>0)
                st.pop();
            else if(ch!='#')
                st.push(ch);
        }
    
        String temp1 = "";
        while(st.size()>0)
            temp1+=st.pop();
        
         for(char ch:t.toCharArray()){
            if(ch=='#' && st.size()>0)
                st.pop();
            else if(ch!='#')
                st.push(ch);
        }
    
        String temp2 = "";
        while(st.size()>0)
            temp2+=st.pop();
        
        
        
    return temp1.equals(temp2);
    }
}
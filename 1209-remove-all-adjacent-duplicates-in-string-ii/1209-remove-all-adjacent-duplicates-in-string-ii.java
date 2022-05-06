class Solution {
    static class Pair{
        char ch;
        int freq;
        
        Pair(char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }

    }
    
    public String removeDuplicates(String str, int k) {
        Stack<Pair> st = new Stack<>();
        
        for(char c:str.toCharArray()){
            //case of unmatching
            if(st.size()==0 || st.peek().ch!=c){
                st.push(new Pair(c,1));
            }
            
              //matching case
            else{
             Pair rp = st.pop();
             st.push(new Pair(rp.ch,rp.freq+1));
                
            if(st.peek().freq==k)
                st.pop();
                
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            Pair rp = st.pop();
            while(rp.freq-->0){
                sb.append(rp.ch);
            }
        }
        return sb.reverse().toString();
        
    }
}
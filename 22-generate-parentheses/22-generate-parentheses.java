class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtracking(new StringBuilder(),0,0,n);
        return ans;
    }
    
    public void backtracking(StringBuilder sb,int open,int close,int max){
        if(sb.length()==2*max){
            ans.add(sb.toString());
            return;
        }
        
        if(open<max){
            sb.append("(");
            backtracking(sb,open+1,close,max);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(close<open){
             sb.append(")");
            backtracking(sb,open,close+1,max);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
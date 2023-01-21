class Solution {
    
    List<String> ans = new ArrayList<>();
    
    
    public List<String> restoreIpAddresses(String s) {
        
        
        String sb = "";
        
        solve(s,0,sb,0);
        
        
        return ans;
        
        
    }
    
    
    public void solve(String s,int i, String sb,int k){
        
        if(i==s.length() || k==4){
            
        if(i==s.length() && k==4){
            ans.add(sb.substring(0,sb.length()-1));
        }
        return; 
    }
        
        solve(s,i+1,sb+s.charAt(i)+".",k+1);
        
        if(i+2<=s.length() && isValid(s.substring(i,i+2)))
            solve(s,i+2,sb+s.substring(i,i+2)+".",k+1);
        
        if(i+3<=s.length() && isValid(s.substring(i,i+3)))
             solve(s,i+3,sb+s.substring(i,i+3)+".",k+1);
        
        
    }
    
    public boolean isValid(String s){
        
        if(s.charAt(0)=='0')
            return false;
        
        int val = Integer.parseInt(s);
        return val<=255;
        
    }
    
}
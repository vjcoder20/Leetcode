class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<=n;i++)
            sb.append("a");
    
        
         int sum = n-1;
        for(int i=sb.length()-1;i>=0;i--){
            int temp = 0;
            for(char ch = 'b';ch<='z';ch++){
               temp = sum+ch-'a'+1;
                if(temp==k){
                    sb.setCharAt(i,ch);
                    return sb.toString();
                }
            }
            sb.setCharAt(i,'z');
            sum = sum+25;
        }
        
        return sb.toString();
    }
}
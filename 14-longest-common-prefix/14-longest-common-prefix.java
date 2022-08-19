class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        
        if(sb.length()==0)
            return "";
        
        
        for(int i=1;i<strs.length;i++){
            String word = strs[i];
            int j = 0;
            for(j=0;j<word.length();j++){
                char ch = word.charAt(j);
                if(j<sb.length() && ch!=sb.charAt(j)){
                    sb = new StringBuilder(word.substring(0,j));
                    break;
                }
                else if(j==sb.length()) break;
            }
            if(j==word.length())
                sb = new StringBuilder(word);
            if(sb.length()==0) break;
            //System.out.println(sb);
            
        }
        
        
        return sb.toString();
    }
}
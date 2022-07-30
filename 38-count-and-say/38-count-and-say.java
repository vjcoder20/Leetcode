class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
       StringBuilder sb = new StringBuilder("11");
        
        for(int i=3;i<=n;i++){
            StringBuilder s = new StringBuilder();
            int count = 1;
            int j = 1;
            for(j=1;j<sb.length();j++){
                if(sb.charAt(j-1)==sb.charAt(j)){
                    count++;
                }
                else{
                    s.append(count);
                    s.append(sb.charAt(j-1));
                    count = 1;
                }
            }
            s.append(count);
            s.append(sb.charAt(j-1));
            sb = new StringBuilder(s);
           
        }
        
        return sb.toString();
    }
}
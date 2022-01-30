class Solution {
    public String subStrHash(String str, int power, int modulo, int k, int hashValue) {
        
        long hash = 0;
        int n = str.length();
        int ind = n;
        long pr = 1;
        
        for(int i=n-1;i>=0;i--){
            hash = ((hash*power)%modulo+(str.charAt(i)-'a'+1))%modulo;
            
            if(i+k>=n){
                pr = (pr*power)%modulo;
            }
            else{
                hash = (hash-((str.charAt(i+k)-'a'+1)*pr)%modulo + modulo)%modulo;
            }
            
            if(hash==hashValue){
                ind = i;
            }
        }
        
        return str.substring(ind,ind+k);
        
        
    }
}
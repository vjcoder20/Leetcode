class Solution {
    public String subStrHash(String str, int power, int modulo, int k, int hashValue) {
        
        //Do dry run and you will know
        //we are traversing from behind because dividing in modulo is not possible that's why we will reverse and multiply instead
        
        long hash = 0;
        int n = str.length();
        int ind = n;
        long pr = 1;
        
        for(int i=n-1;i>=0;i--){
            hash = (hash*power+(str.charAt(i)-'a'+1))%modulo;
            
            
            //if we have to remove or not decide here
            
            if(i+k>=n){ // keep updating power not removal
                pr = pr*power%modulo;
            }
            else{ //removing
                hash = (hash-(str.charAt(i+k)-'a'+1)*pr%modulo + modulo)%modulo;
            }
             //ye rule hai mod minus karne ka
            
            if(hash==hashValue){
                ind = i;
            }
        }
        
        return str.substring(ind,ind+k);
        
        
    }
}
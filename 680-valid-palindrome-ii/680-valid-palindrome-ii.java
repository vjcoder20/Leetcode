class Solution {
    public boolean checkPallindrome(String s,int l,int r){
        
        while(l<r){
             if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
           
                l++;
                r--;
        }
        return true;
        }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        boolean one = false;
        
        //check at both ends if any pallindrome exist then we are good to go
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return checkPallindrome(s,l,r-1) || checkPallindrome(s,l+1,r);
            }
           
                l++;
                r--;
        }
        return true;
    }
}
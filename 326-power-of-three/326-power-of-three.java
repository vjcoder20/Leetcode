class Solution {
    public boolean isPowerOfThree(int n) {
        
        while(n>1){
            if(n%3>=1) return false;
            n = n/3;
        }
        
        return n==1;
    }
}
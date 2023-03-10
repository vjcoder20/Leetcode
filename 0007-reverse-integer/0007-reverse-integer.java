class Solution {
    public int reverse(int x) {
        
        int sign = 1;
        if(x<0){
            sign*=-1;
            x = -x;
        }
        
        
        int ans = 0;
        while(x>0){
            if (Integer.MAX_VALUE / 10 < ans || (Integer.MAX_VALUE - x % 10) < ans * 10) {
                return 0;
            }
            ans = ans*10+x%10;
            x = x/10;
        }
        
            
        return ans*sign;
        
    }
}
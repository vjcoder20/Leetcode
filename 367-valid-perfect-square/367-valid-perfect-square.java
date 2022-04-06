class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long h = num;
        
        while(l<=h){
            long mid = l+(h-l)/2;
            if(mid*mid>num)
                h = mid-1;
            else
            l = mid+1;
        }
        
        return h*h==num;
    }
}
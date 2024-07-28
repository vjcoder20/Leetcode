class Solution {
    public int nonSpecialCount(int l, int r) {
        int num = (int)Math.sqrt(r);
        int special=0;
        while(num*num>=l && num*num<=r){
            boolean flag = true;
            for(int i=2; i<=(int)Math.sqrt(num); i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                special++;
            }
            num--;
        }
        int ans = r-l+1-special;
        if(l==1){
            ans++;
        }
        return ans;
    }
    }
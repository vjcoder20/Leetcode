class Solution {
    public int titleToNumber(String str) {
        int p =1;
        int ans = 0;
        for(int i = str.length()-1;i>=0;i--){
            ans+=(str.charAt(i)-'A'+1)*p;
                p*=26;
        }
        return ans;
    }
}
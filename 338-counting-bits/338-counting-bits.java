class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        while(n!=0){
            int k = n;
            int count = 0;
            while(k!=0){
                k = (k&(k-1));
                count++;
            }
            res[n] = count;
            n--;
        }
        return res;
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        long add = 0;
        long product = 1;
        while(n!=0){
            int rem = n%10;
            product*=rem;
            add+=rem;
            n = n/10;
        }
        return (int)(product-add);
    }
}
class Solution {
    int max = Integer.MAX_VALUE;
    int ans = Integer.MIN_VALUE;
    public int findClosestNumber(int[] arr) {
          Arrays.sort(arr);
        for(int elem:arr){
            int pot = Math.abs(elem-0);
            if(pot<=max){
                max = pot;
                ans = elem;
            }
        }
        return ans;
    }
}
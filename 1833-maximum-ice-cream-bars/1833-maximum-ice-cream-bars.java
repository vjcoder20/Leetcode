class Solution {
    public int maxIceCream(int[] arr, int coins) {
        
        Arrays.sort(arr);
        
        int ans = 0;
        
        
        for(int elem:arr){
            
            if(elem<=coins){
                ans++;
                coins-=elem;
            }
            
        }
        
        return ans;
        
    }
}
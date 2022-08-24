class Solution {
    public int minOperations(int[] arr, int x) {
        
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int elem:arr)
            sum+=elem;
        
        int ts = sum-x;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int ps = 0;
        
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
             map.put(ps,i);
            if(map.containsKey(ps-ts))
                ans = Math.max(ans,i-map.get(ps-ts));
            

        }
        
        if(ans!=Integer.MIN_VALUE)
            return arr.length-ans;
        return -1;
        
    }
}
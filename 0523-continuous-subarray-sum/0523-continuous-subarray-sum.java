class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum%k)){
                if((i-map.get(sum%k))>1)
                    return true;
            }
            map.putIfAbsent(sum%k,i);
        }
        return false;
    }
}
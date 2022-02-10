class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
          int sum = 0, result = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                result+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}
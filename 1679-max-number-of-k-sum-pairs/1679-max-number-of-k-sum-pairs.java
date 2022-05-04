class Solution {
    public int maxOperations(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                ans++;
                int get = map.get(k-arr[i]);
                if(get==1)
                    map.remove(k-arr[i]);
                else
                    map.put(k-arr[i],get-1);
            }
            else
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return ans;
    }
}
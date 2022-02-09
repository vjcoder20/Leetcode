class Solution {
    public int findPairs(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int count = 0;
        for(int x:map.keySet()){
            if(k>0 && map.containsKey(x+k) || k==0 && map.get(x)>1)
            count++;
        }
        return count;
    }
}
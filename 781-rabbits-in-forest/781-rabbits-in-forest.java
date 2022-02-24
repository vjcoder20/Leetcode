class Solution {
    public int numRabbits(int[] arr) {
       int mr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int key:map.keySet()){
            int val = map.get(key);
            int gs = key+1;
            mr+=Math.ceil(val*1.0/gs)*gs;
        }
        
        return mr;
    }
}
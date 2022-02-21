class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        
        for(int elem:map.keySet()){
            int freq = map.get(elem);
            if(freq>n/2){
                return elem;
            }
        }
        return -1;
    }
}
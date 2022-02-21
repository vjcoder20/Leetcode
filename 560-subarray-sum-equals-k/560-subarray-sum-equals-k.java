class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
		int oans = 0;
		int ps = 0;
		
		map.put(0,1);
		for(int i=0;i<arr.length;i++){
		    ps+=arr[i];
		    
		    if(map.containsKey(ps-k)){
		        oans+=map.get(ps-k);
		    }
		    
		    map.put(ps,map.getOrDefault(ps,0)+1);
		}
		
		return oans;
    }
}
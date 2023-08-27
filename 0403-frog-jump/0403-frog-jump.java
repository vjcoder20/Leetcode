class Solution {
    public boolean canCross(int[] arr) {
         if(arr.length==0){
        return true;
    }
    
    HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
    map.put(0,new HashSet<>());
    map.get(0).add(1);
    
    for(int i=1;i<arr.length;i++){
        map.put(arr[i],new HashSet<>());
    }
    
    for(int i=0;i<arr.length;i++){
        int stone = arr[i];
        	for (int step : map.get(stone)) {
        		int reach = step + stone;
        		if (reach == arr[arr.length - 1]) {
        			return true;
        		}
    if(map.containsKey(reach)){
        	    if(step-1>=0)
        	    map.get(reach).add(step-1);
        	    map.get(reach).add(step);
        	     map.get(reach).add(step+1);
        	}
            }

  }
  return false;
    }
}
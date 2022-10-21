class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int elem = arr[i];
            if(map.containsKey(elem)){
                List<Integer> li = map.get(elem);
                li.add(i);
                map.put(elem,li);
            }
            else{
               List<Integer> li = new ArrayList<>(); 
                li.add(i);
                map.put(elem,li);
            }
        }
        
        for(int key:map.keySet()){
            List<Integer> li = map.get(key);
            if(li.size()>1){
               
                for(int i=1;i<li.size();i++){
                    int geti = li.get(i-1);
                    int getj = li.get(i);
                    if((getj-geti)<=k)
                        return true;
                }
                   
                }
            }
        
        
        return false;
    }
}
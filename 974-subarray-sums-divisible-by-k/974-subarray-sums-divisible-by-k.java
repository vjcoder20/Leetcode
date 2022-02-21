class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();    //remainder vs frequency
        
        int ps = 0;
        int oans = 0;
        
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            ps+=arr[i];
            
            int rem = ps%k;
            
            if(rem<0){
                rem+=k;
            }
            
            if(map.containsKey(rem)){
              oans+=map.get(rem);
            }
            
            map.put(rem,map.getOrDefault(rem,0)+1);
        }

        return oans;
    }
}
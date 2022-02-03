class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int count = 0;
        int target = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums1){
            for(int j:nums2){
                map.put((i+j),map.getOrDefault(i+j,0)+1);
            }
        }
        
      for(int i:nums3){
          for(int j:nums4){
              count+=map.getOrDefault(target-(i+j),0);
          }
      }
        
        return count;
    }
}
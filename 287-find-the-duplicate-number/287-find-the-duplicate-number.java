class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int elem:arr){
            if(map.containsKey(elem)==false)
                map.put(elem,1);
            else{
                ans = elem;
                break;
            }
        }
        return ans;
    }
}
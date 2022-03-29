class Solution {
    public int findDuplicate(int[] arr) {
        /*Method 1  O(n) tc and O(n) sc
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
        */
        int ans = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               ans = arr[i];
                break;
            }
        }
        return ans;
    }
}
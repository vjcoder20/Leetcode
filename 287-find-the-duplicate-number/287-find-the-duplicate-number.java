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
        /* Method 2 O(nlogn) tc and O(1) sc
        int ans = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
               ans = arr[i];
                break;
            }
        }
        return ans;
        */
        //Method 3 O(n) tc and O(1) sc
        int duplicate = -1;
        for(int i=0;i<arr.length;i++){
            // System.out.println(Arrays.toString(arr));
            int num = Math.abs(arr[i]);
            if(arr[num]<0){
                duplicate = num;
                break;
            }
            arr[num]*=-1;
        }
        return duplicate;
    }
}
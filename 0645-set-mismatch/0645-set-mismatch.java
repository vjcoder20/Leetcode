class Solution {
    public int[] findErrorNums(int[] arr) {
       
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        
        for(int elem:arr){
            if(set.contains(elem))
                ans[0] = elem;
            else
            set.add(elem);
        }
        
        for(int i=1;i<=arr.length;i++){
            if(set.contains(i)==false){
                ans[1] = i;
                break;
            }
        }
       
        return ans;
    }
}
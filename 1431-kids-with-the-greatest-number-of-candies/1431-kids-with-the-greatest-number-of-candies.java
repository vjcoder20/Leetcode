class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int x) {
        List<Boolean> li = new ArrayList<>();
        
        int max = 0;
        
        for(int elem:arr)
            max = Math.max(max,elem);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]+x>=max)
                li.add(true);
            else
            li.add(false);
        }
        
        return li;
    }
}
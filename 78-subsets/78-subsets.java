class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> li = new ArrayList<>();
        for(int mask = 0;mask<(1<<n);mask++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((mask >> j) & 1)==1){
                    al.add(arr[j]);
                }
            }
            li.add(new ArrayList<>(al));
        }
        return li;
    }
}
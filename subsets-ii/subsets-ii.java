class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        fun(arr,0,al);
        return res;
    }
    public void fun(int[] arr,int idx,ArrayList<Integer> al){
        if(idx==arr.length){
            res.add(new ArrayList<>(al));
            return;
        }
        
        al.add(arr[idx]);
        fun(arr,idx+1,al);
        al.remove(al.size()-1);
            idx++;
        while (idx < arr.length && arr[idx - 1] == arr[idx])
            idx++;
        fun(arr,idx,al);
    }
}
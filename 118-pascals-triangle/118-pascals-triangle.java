class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li = new ArrayList<>();
        
         for(int i=0;i<n;i++){
            int val = 1;
             List<Integer> al = new ArrayList<>();
            for(int j=0;j<=i;j++){
               al.add(val);
                val = (val*(i-j))/(j+1);
            }
           li.add(al);
    }
        return li;
    }
}
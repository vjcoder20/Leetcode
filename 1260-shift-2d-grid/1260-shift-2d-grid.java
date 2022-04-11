class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        List<List<Integer>> li = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        
        int total = m*n;
        k = k%total;
        
        for(int i=0;i<m;i++){
            
            List<Integer> al = new ArrayList<>();
            li.add(al);
                
            for(int j=0;j<n;j++){
             int index = ((i * n + j) - k + total) % total;
            // System.out.println(index);
            al.add(arr[index / n][index % n]);
            }
            // System.out.println(al);
        }
        
      
        
        return li;
    }
}
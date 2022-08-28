class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] arr = new int[n][m];
        
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int diff = i-j;
                if(!map.containsKey(diff))
                    map.put(diff,new PriorityQueue<>());
                
                map.get(i-j).add(mat[i][j]);
                
            }
        }
        
        //System.out.println(map);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = map.get(i-j).remove();
            }
        }
        return arr;
    }
}
class Solution {
    
    public boolean checkValid(int[][] matrix) {
     
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=matrix.length;i++){
            set.add(i);
        }
        
        for(int i=0;i<matrix.length;i++){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
            for(int j=0;j<matrix[0].length;j++){
               set1.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }
            if(set1.size()!=set.size() || set2.size()!=set.size()){
                return false;
            }
        }
        
        
        return true;
    }
}
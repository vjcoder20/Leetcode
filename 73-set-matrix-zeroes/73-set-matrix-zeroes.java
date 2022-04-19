class Solution {
    static class Pair{
        int x;
        int y;
        
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public void setZeroes(int[][] arr) { 
        /*O(mn) space
        int m = arr.length;
        int n = arr[0].length;
        
        List<Pair> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    al.add(new Pair(i,j));
                }
            }
        }
        
        for(Pair rem:al){
            int row = rem.x;
            int col = rem.y;
            
            for(int i=0;i<n;i++){
                arr[row][i] = 0;
            }
            
            for(int i=0;i<m;i++){
                arr[i][col] = 0;
            }
        }
    }
    */
            // O(1) space
        boolean fr = false;;
        boolean fc = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    if(i==0) fr = true;
                    if(j==0) fc = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][0]==0 || arr[0][j]==0)
                    arr[i][j] = 0;
            }
        }
        
        if(fr==true)
            for(int i=0;i<arr[0].length;i++)
                arr[0][i] = 0;
        
          if(fc==true)
            for(int i=0;i<arr.length;i++)
                arr[i][0] = 0;
            
    }   
}
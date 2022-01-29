class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            
            int min = arr[i][0];
            int col = 0;
            for(int j=1;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                    col = j;
                }
              
            }
            
            int k = 0;
            for(k=0;k<arr.length;k++){
                if(arr[i][col]<arr[k][col])
                    break;
            }
            if(k==arr.length){
                al.add(arr[i][col]);
                break;
            }
         
        }
        return al;
    }
}
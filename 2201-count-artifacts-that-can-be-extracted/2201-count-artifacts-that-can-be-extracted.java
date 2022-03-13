class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        boolean[][] visited = new boolean[n][n];
        for(int i=0;i<dig.length;i++){
          visited[dig[i][0]][dig[i][1]] = true;
        }
        int count = 0;
        for(int[] arr:artifacts){
            boolean done = true;
            for(int i=arr[0];i<=arr[2];i++){
                for(int j=arr[1];j<=arr[3];j++){
                    if(visited[i][j]==false)
                        done = false;
                }
            }
            if(done==true) count++;
        }
        
        //Agar visited array kaise fill huya hai samaj nahi aaye toh print kara kar dekh lena visited array ko neeche wale comment se
        // System.out.println(Arrays.deepToString(visited));
        
        return count;
    }
}
class Solution {
    public int snakesAndLadders(int[][] board) {
        
    int rows=board.length,cols=board[0].length,end=rows*cols;
    Map<Integer,int[]>map=new HashMap<>();
    int cur=1;
    boolean flag=true;
    for(int i=rows-1;i>=0;i--){
        if(flag){
            for(int j=0;j<cols;j++){
                map.put(cur, new int[]{i,j});
                cur++;
            }
            flag=false;
        }
        else {
            for(int j=cols-1;j>=0;j--){
                map.put(cur, new int[]{i,j});
                cur++;
            }
            flag=true;
        }       
    }
    Queue<int[]> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
    boolean visited[]=new boolean[end+1];
    
    q.add(new int[]{1,0});
    while(!q.isEmpty()){
        int curr[]=q.poll();
        if(curr[0]==end){
            return curr[1];
        }
        if(visited[curr[0]]) continue;
        visited[curr[0]]=true;
        
        for(int i=1;i<=6;i++){
            int next=curr[0]+i;
            if(next>end) break;
            int temp[]=map.get(next);
            if(board[temp[0]][temp[1]]!=-1){
                next=board[temp[0]][temp[1]];
            }
            q.add(new int[]{next,curr[1]+1});
        }
    }
        
        
        return -1;
        
    }
}
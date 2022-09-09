class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->(a[0]==b[0])?b[1]-a[1]:a[0]-b[0]);
       
        int mtn = Integer.MIN_VALUE;                            
          int ans = 0;

          for (int i = arr.length- 1; i >= 0; i--)
          {
               if (arr[i][1] < mtn) 
                    ans++;
               
              mtn = Math.max(mtn, arr[i][1]);
          }
          return ans;
        
        
    }
}
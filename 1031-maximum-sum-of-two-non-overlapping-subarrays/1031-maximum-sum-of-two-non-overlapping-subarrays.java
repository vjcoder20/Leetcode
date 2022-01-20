class Solution {
    	public int solution(int[] arr, int x, int y){
		int[] dp1 = new int[arr.length];
		
		int n = arr.length;
		int[] dp2 = new int[arr.length];
		
		int temp = 0;
		for(int i=0;i<x;i++){
		    temp+=arr[i];
		}
		
		dp1[x-1] = temp;
		
		for(int i=x;i<dp1.length;i++){
		     temp = temp-arr[i-x]+arr[i];
		    dp1[i] = Math.max(dp1[i-1],temp);
		}
		
		temp = 0;
		for(int i=n-1;i>=n-y;i--){
		    temp+=arr[i];
		}
		
		dp2[n-y] = temp;
		
			for(int i=n-y-1;i>=0;i--){
			   temp = temp-arr[i+y]+arr[i];
		    dp2[i] = Math.max(dp2[i+1],temp);
		}
		
        
        int ans = 0;
     for(int i=x-1;i<n-y;i++){
         ans = Math.max(ans,dp1[i]+dp2[i+1]);
     }
      
       return ans;
		
	}
    public int maxSumTwoNoOverlap(int[] arr, int x, int y) {
        return Math.max(solution(arr,x,y),solution(arr,y,x));
    }
}